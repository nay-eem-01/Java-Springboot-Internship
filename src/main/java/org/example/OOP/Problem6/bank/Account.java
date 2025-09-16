package org.example.OOP.Problem6.bank;

public sealed class Account permits SavingsAccount,FixedDepositAccount {
    private Long AccountId;
    private String accountName;
    private double balance;
    private String accountType;



    public Account(Long accountId, String accountName, double balance, String accountType) {
        AccountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
