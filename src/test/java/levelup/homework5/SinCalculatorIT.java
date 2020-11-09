package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "sinDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorSinTest(double a, double expected) {
        double actual = calculator.sin(a);
        Assert.assertEquals(actual, expected, 0.0000001);
    }
}
