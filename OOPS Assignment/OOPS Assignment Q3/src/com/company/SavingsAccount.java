package com.company;

class SavingsAccount extends Assignments2q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }

}