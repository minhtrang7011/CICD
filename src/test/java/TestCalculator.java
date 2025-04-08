import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(3, 4), 7);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(4, 3), 1);
    }
}
