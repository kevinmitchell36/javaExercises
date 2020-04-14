package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
       printFactors(6);
       printFactors(32);
       printFactors(10);
       printFactors(-1);
    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid value");
        }
        int factor = 1;
        while(true) {
            if(factor > number) {
                break;
            } else if(number % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }
    }
}
