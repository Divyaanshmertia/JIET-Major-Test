package com.divyaansh;

import java.util.Scanner;

public class SameBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt ();

        int base = 2;


        while (!sameBase(m, base))

            base++;

        System.out.println (base);
    }

    private static Boolean sameBase(int m , int base) {

        int rem = m % base;

        m = m / base;

        while (m >= base && (m % base == rem)){
            m = m / base;
        }



        if (m == rem){
            return true;
        }



        return false;
    }
}
