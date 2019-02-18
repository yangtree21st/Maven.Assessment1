package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
//        int result=0 ;
//        int firstPart = k / j;
//
//            if ( k%j == 0)
//            { result = firstPart;
//            } else {
//                result = firstPart+1;
//            }
//            return result;
//        }
//
//    }
//
//
            int firstOver = k%j;
            int numKJumps = (k-firstOver/j);
            return firstOver + numKJumps;
        }
    }
//
