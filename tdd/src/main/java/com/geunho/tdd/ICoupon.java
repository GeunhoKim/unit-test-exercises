package com.geunho.tdd;

public interface ICoupon {
  String getName();
  boolean isValid();
  int getDiscountPercent();
  boolean isAppliable(Item item);
  void doExpire();
}
