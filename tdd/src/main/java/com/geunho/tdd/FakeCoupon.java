package com.geunho.tdd;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements ICoupon {
  List<String> categories = new ArrayList();

  public FakeCoupon() {
    categories.add("부엌칼");
    categories.add("아동 장난감");
    categories.add("조리기구");
  }

  public String getName() {
    return null;
  }

  public boolean isValid() {
    return true;
  }

  public int getDiscountPercent() {
    return 7;
  }

  public boolean isAppliable(Item item) {
    if (categories.contains(item.getCategory())) {
      return true;
    }
    return false;
  }

  public void doExpire() {

  }
}
