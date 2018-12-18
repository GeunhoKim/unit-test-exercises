package com.geunho.tdd;

// 아무 구현이 없는 인스턴스화만 가능한 스켈레톤 코드
public class DummyCoupon implements ICoupon {
  public String getName() {
    return null;
  }

  public boolean isValid() {
    return false;
  }

  public int getDiscountPercent() {
    return 0;
  }

  public boolean isAppliable(Item item) {
    return false;
  }

  public void doExpire() {

  }
}
