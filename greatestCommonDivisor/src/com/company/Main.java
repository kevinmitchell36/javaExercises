package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }
       int divisor = Math.min(num1, num2);
       while (true) {
           if ((num1 % divisor == 0) && (num2 % divisor == 0)) {
               return divisor;
           }
           divisor--;
       }
    }
}
