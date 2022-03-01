package savingAccount;

import java.util.Scanner;

public class Balance {

    public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {

        System.out.println("Available balance = "+withdraw());
    }

    static double withdraw() throws InsufficientBalanceException, IllegalBankTransactionException {

        double balance = 2000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amount to withdraw : ");
        double withdrawAmount = scan.nextDouble();

        if (withdrawAmount<0)
            throw new IllegalBankTransactionException ("Illegal Bank Transaction");
        else if (balance<withdrawAmount || balance==0)
            throw new InsufficientBalanceException("Insufficient Balance");
        return (balance-withdrawAmount);

    }
}
