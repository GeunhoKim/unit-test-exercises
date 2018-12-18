package com.geunho.tdd;

import java.util.Objects;

public class Item {
  private String category;
  private int price;

  public Item(String name, String category, int price) {
    this.price = price;
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public String getCategory() {
    return category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item)) return false;
    Item item = (Item) o;
    return getPrice() == item.getPrice() &&
        Objects.equals(getCategory(), item.getCategory());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCategory(), getPrice());
  }
}
