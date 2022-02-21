package com.java.Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int p, time;
    double rate, SI, CI;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of p: ");
        p = sc.nextInt();
        System.out.println("Enter time(Years) : ");
        time = sc.nextInt();
        System.out.println("Enter rate(Percentage): ");
        rate = sc.nextFloat();

        double r = rate/100;
        int t = time*12;

        SI = (p*t*r)/100;
        CI = p*(Math.pow((1+r),t))-p;

        System.out.println("Simple Interest = "+SI);
        System.out.println("Compound Interest = "+CI);


    }
}
