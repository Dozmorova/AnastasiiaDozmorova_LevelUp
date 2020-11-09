package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "powDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorPowTest(double a, double b, double expected) {
        double actual = calculator.pow(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
