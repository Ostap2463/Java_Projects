/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingprogram;

/**
 *
 * @author main
 */
public final class Account {

    private String customerName;
    private String accountNo;
    private double balance;

    public Account() {
        setAccountNo("0000000");
        setCustomerName("Unknown");

    }

    public Account(String customerName, String accountNo) {
        this.customerName = customerName;
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        if (accountNo.matches("^[0-9]{7}")) {
            this.accountNo = accountNo;
        } else {
            throw new IllegalArgumentException("Seven numbers");
        }

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && customerName != " ") {
            this.customerName = customerName;
        } else {
            throw new IllegalArgumentException("Field must not be empty");
        }

    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Must be positive");
        }

    }

    public void withdraw(double amount) {
        setBalance(this.balance - amount);
    }

    public void deposit(double deposit) {
        setBalance(balance + deposit);
    }

    @Override
    public String toString() {
        return "Account{" + "customerName=" + customerName + ", accountNo=" + accountNo + ", balance=" + balance + '}';
    }

}
