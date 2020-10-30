package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "multLongDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorMultLongTest(long a, long b, long expected) {
        long actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "multDoubleDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorMultDoubleTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
