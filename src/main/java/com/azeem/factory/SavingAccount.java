package com.azeem.factory;

public class SavingAccount implements BankAccount{
    @Override
    public void withdraw(int amount) {
        if(amount <= 0){
            System.out.println("Invalid amount details");
            return;
        }
        System.out.println(amount + " withdrawn from saving account");
    }

    @Override
    public void deposit(int amount) {
        if(amount <= 0){
            System.out.println("Invalid amount details");
            return;
        }
        System.out.println(amount + " deposited to saving account");
    }
}
