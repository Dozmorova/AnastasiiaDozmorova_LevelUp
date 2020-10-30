package levelup.homework5;
import org.testng.annotations.*;
import org.testng.Assert;

public class SumCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "sumLongDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSumLongTest(long a, long b, long expected) {
        long actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "sumDoubleDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSumDoubleTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
