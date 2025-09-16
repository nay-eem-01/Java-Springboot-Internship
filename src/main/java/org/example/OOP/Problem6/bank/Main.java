package org.example.OOP.Problem6.bank;

public class Main {
    public static void main(String[] args) {
        Account savingAccount = AccountFactory.createAccount(1L,"ABC",299.45,"Saving");
        Account fixedDeposit = AccountFactory.createAccount(1L,"ABC",299.45,"FD");

        System.out.println( savingAccount.toString());
        System.out.println( fixedDeposit.toString());


    }
}
