package 实验四.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankManager manager = new BankManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== 银行账户管理系统 ======");
            System.out.println("1. 添加新账户");
            System.out.println("2. 查询账户余额");
            System.out.println("3. 存款");
            System.out.println("4. 取款");
            System.out.println("5. 删除账户");
            System.out.println("6. 打印账户信息");
            System.out.println("0. 退出");
            System.out.print("请输入操作编号：");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入账户ID：");
                    String id = scanner.nextLine();
                    System.out.print("请输入账户持有人姓名：");
                    String owner = scanner.nextLine();
                    manager.addAccount(id, owner);
                    break;
                case 2:
                    System.out.print("请输入账户ID：");
                    id = scanner.nextLine();
                    double balance = manager.getBalance(id);
                    System.out.println("当前余额为：" + balance);
                    break;
                case 3:
                    System.out.print("请输入账户ID：");
                    id = scanner.nextLine();
                    System.out.print("请输入存款金额：");
                    double depositAmount = scanner.nextDouble();
                    manager.deposit(id, depositAmount);
                    break;
                case 4:
                    System.out.print("请输入账户ID：");
                    id = scanner.nextLine();
                    System.out.print("请输入取款金额：");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        manager.withdraw(id, withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("错误：" + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("请输入要删除的账户ID：");
                    id = scanner.nextLine();
                    manager.removeAccount(id);
                    break;
                case 6:
                    System.out.print("请输入账户ID：");
                    id = scanner.nextLine();
                    manager.printAccountInfo(id);
                    break;
                case 0:
                    System.out.println("感谢使用，再见！");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效输入，请重新选择。");
            }
        }
    }
}
