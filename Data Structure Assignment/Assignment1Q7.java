package com.java.Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 15 elements: ");
       int[] array = new int[15];
        for(int i = 0; i< array.length; i++)
            array[i] = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Value to check : ");
        int valueToCheck = sc2.nextInt();
        boolean isThere=false;
        for (int j=0; j< array.length; j++) {
            if (array[j] == valueToCheck){
                isThere=true;
                System.out.println("Array contains "+valueToCheck);
            }
        }if (!isThere)
            System.out.println("Array doesn't contain "+valueToCheck);
    }
}
