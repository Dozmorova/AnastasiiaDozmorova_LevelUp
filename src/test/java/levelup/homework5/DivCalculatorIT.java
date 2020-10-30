package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "divDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorDivTest(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
