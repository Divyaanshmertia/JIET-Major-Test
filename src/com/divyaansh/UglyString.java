package com.divyaansh;

import java.util.Scanner;

public class UglyString {

    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();
            String S = scn.next();
            int CASH = scn.nextInt();
            int A = scn.nextInt();
            int B = scn.nextInt();

            int ans = reduceUgly(N,S,CASH,A,B);
        System.out.println(ans);

        }

    private static int reduceUgly(int n, String s, int cash, int a, int b) {

        for (int i = 0; i < n-1; i++) {


            if(s.charAt(i) == '0'){
                continue;
            }
            if(s.charAt(i) == '1'){
                if(s.charAt((i+1)) == '0' && cash>=a && (i+1) < n && a<b){
                    s = swap(s,i,i+1);
                    cash -=a;
                }else if(cash>=b){
                    s = flip(s,i);
                    cash-=b;

                }

            }
        }
        Integer ans = Integer.parseInt(s,2);
        return ans;
    }

    private static String flip(String s, int i) {
        char ch = '0';
       s = s.substring(0,i) + ch + s.substring(i+1);
       return s;

    }

    private static String swap(String s, int i, int i1) {
        s = s.substring(0,i) + '0' + '1' + s.substring(i1+1);

        return  s;
    }
}

