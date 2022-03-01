package Exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Question 1
        int a=0;
        int b=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println("result="+c);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide these numbers");
        }

    }
}

