package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "tgDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorTgTest(double a, double expected) {
        double actual = calculator.tg(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
