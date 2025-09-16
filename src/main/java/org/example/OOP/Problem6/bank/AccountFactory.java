package org.example.OOP.Problem6.bank;

public class AccountFactory {
    public AccountFactory() {
    }

    public static Account createAccount(Long accountId,String accountName,double balance,String accountType){
        if (accountType.equals("Saving")){
            return new SavingsAccount(accountId,accountName,balance,accountType);
        } else if (accountType.equals("FD")) {
            return new FixedDepositAccount(accountId,accountName,balance,accountType);
        }
        throw new RuntimeException("Account Type not found");
    }

}
