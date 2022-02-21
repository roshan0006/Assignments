package com.java.Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter CTC: ");
        Scanner input = new Scanner(System.in);
        double ctc = input.nextInt();
        if(ctc>181001 && ctc<300000)
            System.out.println((ctc*10)/100);
        else if(ctc>300001 && ctc<500000)
            System.out.println((ctc*20)/100);
        else if(ctc>500001 && ctc<1000000)
            System.out.println((ctc*30)/100);
        else
            System.out.println("Nil");
    }
}
