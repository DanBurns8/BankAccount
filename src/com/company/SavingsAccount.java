package com.company;

public class SavingsAccount extends Account {

    private double interestrate;
    public SavingsAccount(int id, double balance,double i){
        super(id,balance);
        interestrate=i;
    }
    public double monthlyInterest(){
        return currentBalance()*(interestrate/12);
    }
    public void withdraw(double amount){
        if(amount<=currentBalance()){decreaseBalance(amount);}
    }
}
