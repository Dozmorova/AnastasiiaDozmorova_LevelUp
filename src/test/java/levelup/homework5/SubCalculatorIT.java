package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "subLongDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSubLongTest(long a, long b, long expected) {
        long actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "subDoubleDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSubDoubleTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
