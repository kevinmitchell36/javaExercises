package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(evenDigitSum(123456789));
        System.out.println(evenDigitSum(252));
        System.out.println(evenDigitSum(-22));
    }

    public static int evenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }
}
