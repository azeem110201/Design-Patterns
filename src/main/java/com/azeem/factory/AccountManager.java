package com.azeem.factory;

public abstract class AccountManager {
    public void createBankAccount(String type){
        BankAccount bankAccount = createBankAccountFactory(type);
    }

    // factory abstract method
    public abstract BankAccount createBankAccountFactory(String type);
}
