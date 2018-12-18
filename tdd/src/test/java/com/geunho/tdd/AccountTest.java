package com.geunho.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {
  @Before
  public void setup() {
  }

  @Test
  public void testAccount() {
  }

  @Test
  public void testGetBalance() {
    Account account = new Account(10000);
    assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

    account = new Account(1000);
    assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());

    account = new Account(0);
    assertEquals("0원으로 계좌 생성 후 잔고 조회", 0, account.getBalance());
  }

  @Test
  public void testDeposit() {
    Account account = new Account(10000);
    account.deposit(1000);
    assertEquals(11000, account.getBalance());
  }

  @Test
  public void testWithdraw() {
    Account account = new Account(10000);
    account.withdraw(1000);
    assertEquals(9000, account.getBalance());
  }
}
