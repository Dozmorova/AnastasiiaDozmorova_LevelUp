package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "isPositiveDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorIsPositiveTest(long a, boolean expected) {
        boolean actual = calculator.isPositive(a);
        Assert.assertEquals(actual, expected);
    }
}
