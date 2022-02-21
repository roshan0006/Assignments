package com.java.Assignment1;

public class Main {

    public static void main(String[] args) {
	 int min = 100, max = 999;
     for(int i = min;i<=max;i++){
         int temp_number = i, sum = 0, remainder = 0;
         while(temp_number>0){
             remainder = temp_number % 10;
             temp_number = temp_number /= 10;
             sum += (remainder*remainder*remainder);
         }
         if(sum == i)
             System.out.println(i);

     }
    }
}
