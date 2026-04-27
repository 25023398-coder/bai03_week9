package com.banksystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
  @Test
  void testWithdraw() {
    BankAccount account = new BankAccount("TEST", 100.0);
    account.withdraw(40.0);
    assertEquals(60.0, account.getBalance());
  }
}