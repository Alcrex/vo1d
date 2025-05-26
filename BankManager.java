package 实验四.BankAccount;

import java.util.HashMap;

public class BankManager {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(String id, String owner) {
        if (accounts.containsKey(id)) {
            System.out.println("Account " + id + " already exists.");
            return;
        }
        BankAccount newAccount = new BankAccount(id, owner);
        accounts.put(id, newAccount);
    }

    public double getBalance(String id) {
        BankAccount account = accounts.get(id);
        if (account == null) {
            System.out.println("Account " + id + " does not exist.");
            return 0;
        }
        return account.getBalance();
    }

    public void deposit(String id, double amount) {
        BankAccount account = accounts.get(id);
        if (account == null) {
            System.out.println("Account " + id + " does not exist.");
            return;
        }
        account.deposit(amount);
    }

    public void withdraw(String id, double amount) throws InsufficientBalanceException {
        BankAccount account = accounts.get(id);
        if (account == null) {
            System.out.println("Account " + id + " does not exist.");
            return;
        }
        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException("余额不足，当前余额：" + account.getBalance());
        }
        account.withdraw(amount);
    }

    public void removeAccount(String id) {
        if (!accounts.containsKey(id)) {
            System.out.println("Account " + id + " does not exist.");
            return;
        }
        accounts.remove(id);
    }

    // ✅ 新增方法：打印账户基本信息
    public void printAccountInfo(String id) {
        BankAccount account = accounts.get(id);
        if (account == null) {
            System.out.println("Account " + id + " does not exist.");
            return;
        }
        System.out.println("账户ID: " + account.getId());
        System.out.println("账户持有人: " + account.getOwner());
        System.out.println("当前余额: " + account.getBalance());
    }
}

