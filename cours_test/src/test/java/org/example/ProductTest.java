import org.example.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testUpdateNormalProduct() {
        Product normalProduct = new Product("pomme", 10, 20);
        normalProduct.update();
        assertEquals(9, normalProduct.getSellIn());
        assertEquals(19, normalProduct.getQuality());
    }


    @Test
    public void testUpdateExpiredNormalProduct() {
        Product expiredProduct = new Product("pomme", 0, 20);
        expiredProduct.update();
        assertEquals(-1, expiredProduct.getSellIn());
        assertEquals(18, expiredProduct.getQuality());
    }

}
