package com.azeem.factory;

public class Main {
    public static void main(String[] args) {
        AccountManager factory = new BankAccountFactory();

        BankAccount bankAccount = factory.createBankAccountFactory("saving");

        bankAccount.deposit(5000);

        bankAccount.withdraw(3000);

        BankAccount bankAccount2 = factory.createBankAccountFactory("current");

        bankAccount2.deposit(5000);

        bankAccount2.withdraw(3000);
    }
}
