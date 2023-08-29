package org.example;

public class Product {
    private String name;
    private int sellIn;
    private int quality;
    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Product() {

    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }


}
