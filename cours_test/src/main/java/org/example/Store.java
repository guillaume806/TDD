package org.example;
import org.example.Product;
public class Store {
    Product product = new Product();
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
