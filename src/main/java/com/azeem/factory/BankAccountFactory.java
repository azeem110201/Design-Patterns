package com.azeem.factory;

public class BankAccountFactory extends AccountManager{
    @Override
    public BankAccount createBankAccountFactory(String type) {
        switch (type){
            case "saving":
                return new SavingAccount();
            case "current":
                return new CurrentAccount();
            default:
                return null;
        }
    }
}
