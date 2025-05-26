# Bank Account Management System
Overview
This project implements a simple bank account management system with custom exception handling for insufficient balance situations.

Features
Custom InsufficientBalanceException to handle cases when an account withdrawal exceeds the available balance.

All bank accounts are stored in a centralized HashMap<String, BankAccount>, where the key is the account ID.

Core functionalities include:

Adding new accounts

Querying account balance by account ID

Depositing money into an account

Withdrawing money from an account (throws InsufficientBalanceException if balance is insufficient)

Deleting accounts by account ID

Usage
Add new accounts to the system.

Query balances with the account ID.

Deposit or withdraw money.

Handle InsufficientBalanceException appropriately during withdrawals.

Remove accounts when no longer needed.

项目概述
本项目实现了一个简单的银行账户管理系统，包含自定义异常处理，用于余额不足时的异常情况。

功能说明
自定义异常类 InsufficientBalanceException，用于处理取款时余额不足的情况。

所有账户信息统一保存在 HashMap<String, BankAccount> 中，键为账户ID。

实现的主要功能包括：

添加新账户

根据账户ID查询账户余额

存款

取款（余额不足时抛出 InsufficientBalanceException）

删除账户

使用说明
向系统添加新账户。

通过账户ID查询余额。

进行存款和取款操作。

在取款时捕获并处理余额不足异常。

不需要账户时删除账户信息。
