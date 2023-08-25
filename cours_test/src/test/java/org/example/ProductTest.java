import org.example.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testUpdateNormalProduct() {
        Product normalProduct = new Product("Normal", 10, 20);
        normalProduct.update();
        assertEquals(9, normalProduct.getSellIn());
        assertEquals(19, normalProduct.getQuality());
    }


}
