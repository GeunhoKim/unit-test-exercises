package com.geunho.tdd;

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
}
