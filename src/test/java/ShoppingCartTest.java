import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testCalculateTotalCost() {
        double price = 10.0;
        int quantity = 5;
        double expectedTotalCost = 50.0;
        double actualTotalCost = price * quantity;
        assertEquals(expectedTotalCost, actualTotalCost, "The total cost calculation is incorrect.");
    }
}