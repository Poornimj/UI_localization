import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuelCalculatorTest {

    @Test
    void testFuelCalculation() {
        double distance = 180;
        double consumption = 6.5;

        double fuel = (consumption / 100) * distance;

        assertEquals(11.7, fuel, 0.01);
    }

    @Test
    void testCostCalculation() {
        double fuel = 11.7;
        double price = 2.05;

        double cost = fuel * price;

        assertEquals(23.985, cost, 0.01);
    }
}