package com.java.Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter subject1 Marks: ");
        int a = input.nextInt();
        System.out.println("Enter subject2 Marks: ");
        int b = input.nextInt();
        System.out.println("Enter subject3 Marks: ");
        int c = input.nextInt();

        if(a>60 && b>60 && c>60){
            System.out.println("Passed");
        }
        else if(a>60 && b>60 || b>60 && c>60 || c>60 && a>60)
            System.out.println("Promoted");
        else
            System.out.println("Failed");
    }
}
