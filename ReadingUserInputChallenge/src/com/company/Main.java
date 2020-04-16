package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int counter = 1;
        int sum = 0;
        while(counter <= 5) {
            System.out.println("Enter number " + counter);
            boolean validNumber = scanner.hasNextInt();
            if(validNumber) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
