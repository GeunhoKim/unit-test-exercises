package com.geunho.tdd;

import java.util.ArrayList;
import java.util.List;

public class User {
  List<ICoupon> coupons;

  public User() {
    coupons = new ArrayList<ICoupon>();
  }

  public User(String name) {
    this();
  }

  public int getTotalCouponCount() {
    return coupons.size();
  }

  public void addCoupon(ICoupon coupon) {
    coupons.add(coupon);
  }
}
