package com.azeem.factory;

public class CurrentAccount implements BankAccount{
    @Override
    public void withdraw(int amount) {
        if(amount <= 0){
            System.out.println("Invalid amount details");
            return;
        }
        System.out.println(amount + " withdrawn from current account");
    }

    @Override
    public void deposit(int amount) {
        if(amount <= 0){
            System.out.println("Invalid amount details");
            return;
        }
        System.out.println(amount + " deposited to current account");
    }
}
