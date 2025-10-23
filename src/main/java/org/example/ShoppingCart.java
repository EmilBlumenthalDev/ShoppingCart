package org.example;

public class ShoppingCart extends Throwable {
    private int itemCount = 0;
    private double totalCost = 0;

    public ShoppingCart() {}

    public int addItems(int numberOfItems) {
        itemCount += numberOfItems;
        return itemCount;
    }

    public int removeItems(int numberOfItems) throws IllegalArgumentException {
        if (itemCount - numberOfItems < 0) {
            throw new IllegalArgumentException("Item count can't be negative");
        }

        itemCount -= numberOfItems;
        return itemCount;
    }

    public double updateTotalCost(double price, int quantity) throws IllegalArgumentException {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price or quantity can't be negative");
        }
        totalCost = price * quantity;
        return price * quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getItemCount() {
        return itemCount;
    }
}
