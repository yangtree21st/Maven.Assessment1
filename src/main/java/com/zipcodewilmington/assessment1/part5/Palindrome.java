package com.zipcodewilmington.assessment1.part5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input) {


        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subs = input.substring(i, j); // find the consecutive substring;
                if (isPalindromes(subs))
                    count++;
            }
        }
        return count;
    }



    private static boolean isPalindromes(String subs) {

        for(int i = 0; i < subs.length(); i++)
            if(subs.charAt(i) != subs.charAt(subs.length() - 1 - i))
            { return false;}
        return true;
    }


    }
