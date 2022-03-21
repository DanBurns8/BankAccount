package com.company;

public class SpecialCheckingAccount extends CheckingAccount {
    private double annualinterestrate;
    private double minbal;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double ai, double m) {
        super(idNumber, startBal, cc);
        annualinterestrate = ai;
        minbal = m;
    }

    public void clearCheck(double amount) {
        if (currentBalance() >= minbal) {
            decreaseBalance(amount);
        } else {
            super.clearCheck(amount);
        }
    }
    public double monthlyInterest() {
        if(currentBalance()>minbal){
            double x = currentBalance() * (annualinterestrate / 12);
        }
        return super.monthlyInterest();
    }
}