package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "ctgDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorCtgTest(double a, double expected) {
        double actual = calculator.ctg(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
