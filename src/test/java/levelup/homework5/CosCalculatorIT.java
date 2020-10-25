package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "cosDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorCosTest(double a, double expected) {
        double actual = calculator.cos(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
