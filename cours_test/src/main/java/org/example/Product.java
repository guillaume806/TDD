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

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void update() {

        if (!name.equals("pomme")) {
            sellIn--;

            if (quality > 0) {
                if (!name.equals("Brie") && !name.equals("Date passes")) {
                    quality--;
                    if (sellIn <= 0) {
                        quality--;
                    }
                } else {
                    if (quality < 50) {
                        quality++;
                        if (name.equals("Date passes")) {
                            if (sellIn < 11) {
                                if (quality < 50) {
                                    quality++;
                                }
                            }
                            if (sellIn < 6) {
                                if (quality < 50) {
                                    quality++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
