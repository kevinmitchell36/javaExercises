package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        while (num1 > 0) {
            int firstSingleNumber = num1 % 10;
            int num2Compare = num2;
            while (num2Compare > 0) {
                int secondSingleNumber = num2Compare % 10;
                if (firstSingleNumber == secondSingleNumber) {
                    return true;
                }
                num2Compare /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}
