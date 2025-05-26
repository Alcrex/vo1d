package 实验四.BankAccount;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {
    private String id;
    private String owner;
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(String id, String owner) {
        this.id = id;
        this.owner = owner;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(LocalDateTime.now() + " 存款: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > balance) {
            throw new InsufficientBalanceException("余额不足，取款失败！");
        }
        balance -= amount;
        transactions.add(LocalDateTime.now() + " 取款: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public void printTransactions() {
        System.out.println("账户 " + id + " 的交易记录：");
        for (String record : transactions) {
            System.out.println(record);
        }
    }

    public String getOwner() {
        return owner;
    }
}


