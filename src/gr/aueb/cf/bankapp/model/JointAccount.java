package gr.aueb.cf.bankapp.model;

import java.util.List;

public class JointAccount extends Account {

        private List<String> users;

        public JointAccount(int id, String iban, double balance, List<String> users) {
            super(id, iban, balance);

            this.users = users;
        }


    /**
     * Adds a user to the list of users of this joint account.
     * @param user the user to be added
     */
    public void addUser(String user) {
        users.add(user);
    }

    /**
     * Removes a user from the list of users of this joint account.
     * @param user the user to be removed
     */
    public void removeUser(String user) {
        users.remove(user);
    }

    public List<String> getUsers() {
        return users;
    }

    @Override
    public synchronized void deposit(double amount) throws Exception {
        super.deposit(amount);
    }

    @Override
    public synchronized void withdraw(double amount, String ssn) throws Exception {
        super.withdraw(amount, ssn);

    }
}







/*
    @Override
    public void deposit(double amount) throws Exception {
        balanceLock.lock();
        try {
            super.deposit(amount);
        } finally {
            balanceLock.unlock();
        }
    }

    @Override
    public void withdraw(double amount, String ssn) throws Exception {
        balanceLock.lock();
        try {
            super.withdraw(amount, ssn);
        } finally {
            balanceLock.unlock();
        }
    }



    @Override
    public void withdraw(double amount, String ssn) throws Exception {
        if (users.contains(ssn)) {
            if (balance - amount >= -creditLimit) {
                super.withdraw(amount, ssn);
            } else {
                throw new Exception("Exceeded credit limit exception");
            }
        } else {
            throw new Exception("Unauthorized user exception");
        }
    }
     @Override
        public void withdraw(double amount, String ssn) throws Exception {
            if (users.contains(ssn)) {
                super.withdraw(amount, ssn);
            } else {
                throw new Exception("Unauthorized user exception");
            }
        }*/

