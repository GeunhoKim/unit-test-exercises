package com.geunho.tdd;

import java.util.ArrayList;
import java.util.List;

public class SpyCoupon implements ICoupon {
  private List<String> categories = new ArrayList();
  private int isAppliableCallCount;

  public SpyCoupon() {
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
    isAppliableCallCount++; // spy code
    if (categories.contains(item.getCategory())) {
      return true;
    }
    return false;
  }

  public void doExpire() {
  }

  // spy code
  public int getIsAppliableCallCount() {
    return isAppliableCallCount;
  }
}
