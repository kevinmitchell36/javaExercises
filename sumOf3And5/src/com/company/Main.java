package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
	      for(int i = 1; i < 1001; i++ ) {
	          if(i % 15 == 0) {
	              sum += i;
	              count++;
	              if(count == 5) {
	                break;
                }
            }
        }
        System.out.println(sum);
    }
}
