package com.geunho.tdd;

// 하드코딩이라도 일부 구현체가 있다면 Stub
public class StubCoupon implements ICoupon {
  public String getName() {
    return "12월 연말 할인 쿠폰";
  }

  public boolean isValid() {
    return true;
  }

  public int getDiscountPercent() {
    return 7;
  }

  public boolean isAppliable(Item item) {
    return true;
  }

  public void doExpire() {

  }
}
