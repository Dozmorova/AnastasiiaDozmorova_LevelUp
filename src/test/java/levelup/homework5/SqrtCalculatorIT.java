package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "sqrtDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSqrtTest(double a, double expected) {
        double actual = calculator.sqrt(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
