package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0 ;

        for( int i = 0; i < objectArray.length; i++){
            if( objectArray[i].equals(objectToCount )){
                count ++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {


        Object[] answer = new Integer[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)];
        int index = 0;
        for (Object current : objectArray) {
            if (!current.equals(objectToRemove)) {
                answer[index] = current;
                index++;
            }
        }
        return answer;

    }
    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1, tempCount;
        Object popular = objectArray[0];
        Object temp = null;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int leng = objectArray.length;
        int min_count = leng+1;
        Object  res = -1;
        int curr_count = 1;

        for (int i = 1; i < leng; i++) {
            if (objectArray[i] == objectArray[i - 1])
                curr_count++;
            else {
                if (curr_count < min_count) {
                    min_count = curr_count;
                    res = objectArray[i - 1];
                }

                curr_count = 1;
            }
        }


        if (curr_count < min_count)
        {
            min_count = curr_count;
            res = objectArray[leng - 1];
        }

        return res;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int aL = objectArray.length;
        int bL = objectArrayToAdd.length;


        Object[] c = (Object[]) Array.newInstance(objectArray.getClass().getComponentType(), aL + bL);
        System.arraycopy(objectArray, 0, c, 0, aL);
        System.arraycopy(objectArrayToAdd, 0, c, aL, bL);

        return c;
    }
}
