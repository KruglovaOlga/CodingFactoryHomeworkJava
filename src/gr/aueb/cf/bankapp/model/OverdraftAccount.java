package gr.aueb.cf.bankapp.model;

import java.util.List;

public class OverdraftAccount extends Account {

    private double creditLimit;

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance, double creditLimit) {
        super(id, iban, firstname, lastname, ssn, balance);
        this.creditLimit = creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(double amount, String ssn) throws Exception {
        try{
        if(!isValid(ssn))
            throw new Exception("SSN not valid exception");

            if (getBalance() - amount >= -creditLimit) {
                super.withdraw(amount, ssn);
            } else {
                throw new Exception("Exceeded credit limit exception");
            }
        } catch(Exception e){
            throw new Exception("Unauthorized user exception");
        }
    }

    private boolean isValid(String ssn) {

        return ssn.equals(ssn);
    }
}
