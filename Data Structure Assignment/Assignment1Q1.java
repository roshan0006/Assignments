package com.java.Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
	   Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int temp_number=0,sum = 0,remainder = 0;
       temp_number = number;

       while(temp_number>0){
           remainder = temp_number % 10;
           temp_number /= 10;
           sum += (remainder*remainder*remainder);
       }
       if(sum == number)
           System.out.println(number + " is an Armstrong Number");
       else
           System.out.println(number + " is not an Armstrong Number");

    }
}