package com.geunho.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
  @Test
  public void testGetOrderPrice_discountableItem() {
    // Given
    PriceCalculator calculator = new PriceCalculator();
    Item item = new Item("LightSavor", "부엌칼", 100000);

    // When
    ICoupon coupon = new StubCoupon();

    // Then
    assertEquals("쿠폰으로 인해 할인된 가격", 93000, calculator.getOrderPrice(item, coupon));
  }

  @Test
  public void testGetOrderPrice_undiscountableItem() {
    // Given
    PriceCalculator calculator = new PriceCalculator();
    Item item = new Item("R2D2", "알람시계", 20000);

    // When
    // Stub은 구현이 하드코딩 되어있기 때문에 다양한 상황의 테스트 케이스에 대응하지 못한다.
//    ICoupon coupon = new StubCoupon();
    // Fake는 여러 인스턴스를 대표할 수 있거나 더 복잡한 구현이 들어간 개체이다.
//    ICoupon coupon = new FakeCoupon();
    ICoupon coupon = new SpyCoupon();

    // Then
    assertEquals("쿠폰 적용 안 되는 상품", 20000, calculator.getOrderPrice(item, coupon));
    int methodCallCount = ((SpyCoupon)coupon).getIsAppliableCallCount();
    assertEquals ("coupon.isAppliable 메소드 호출 횟수", 1, methodCallCount);
  }
}
