package gr.aueb.cf.bankapp.model;

/**
 * Javabean + Functionality
 * Public API = Public methods
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){}

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public Account(int id, String iban, double balance) {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    //Service Layer, Public API

    /**
     * Deposits a zero or positive amount of money
     * to account's balance.
     *
     * @param amount
     *              the amount of money to be deposed
     * @throws  Exception
     *              if the amount is negative
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            } else throw new Exception("Negative amount exception");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraw a certain amount of money from
     * account's balance.
     * @param amount
     *              the amount to be drawn
     * @throws Exception
     *              if the amount is greater than account's balance
     *              or ssn is not valid
     */
    public void withdraw(double amount, String ssn) throws Exception {

        try{
            if(!isValid(ssn)) throw new Exception("SSN not valid exception");
            if (amount <= balance) {
                balance -= amount;
            } else {
                throw new Exception("Insufficient balance exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the account's balance.
     * @return
     *          the account's balance
     */
    public double getAccountBalance() {

        return getBalance();
    }

    public String getAccountState() {
        return "(" + id + ", " + ", " + firstname + ", "
                + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isValid(String ssn) {

        return this.ssn.equals(ssn);
    }
}

