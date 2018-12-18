package com.geunho.tdd;

public class Account {
  private int balance;

  public Account(int money) {
    this.balance = money;
  }

  public int getBalance() {
    return balance;
  }

  public void withdraw(int money) {
    balance -= money;
  }

  public void deposit(int money) {
    balance += money;
  }
}
