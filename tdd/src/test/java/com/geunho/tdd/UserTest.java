package com.geunho.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
  @Test
  public void testAddCoupon() {
    // Given
    User user = new User("area88");
    assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());

    // When
    ICoupon coupon = new StubCoupon();

    // Then
    user.addCoupon(coupon);
    assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
  }
}
