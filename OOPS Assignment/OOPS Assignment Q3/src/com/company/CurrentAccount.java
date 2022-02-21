package com.company;

class CurrentAccount extends Assignments2q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;

    public int getCash() {
        return totalDeposits+creditLimit;
    }

}