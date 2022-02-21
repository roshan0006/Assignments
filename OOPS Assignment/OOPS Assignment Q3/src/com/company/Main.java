package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Assignments2q3 assignments2q3 = new Assignments2q3();

        CurrentAccount currentAccount = new CurrentAccount();
        int currentbal = currentAccount.getCash();

        SavingsAccount savingsAccount = new SavingsAccount();
        int savbal = savingsAccount.getCash();

        ArrayList<Integer> cash = new ArrayList<>();
        cash.add(currentbal);
        cash.add(savbal);

        System.out.println(assignments2q3.totalCashInBank(cash));
    }
}
