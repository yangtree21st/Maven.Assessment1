package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {



    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int a = 0;
        int b = n;
            int sum=0;
            while(a < b) {
                sum+=a;
                a++;
            }
            return sum;

        }



    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product = 1;
        for (int i = 1; i < n; i++) {
        product = product * i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer reverse;
        String reve = val.toString();
        reve = BasicStringUtils.reverse(reve);
        reverse = Integer.parseInt(reve);
        return reverse;
    }
}
