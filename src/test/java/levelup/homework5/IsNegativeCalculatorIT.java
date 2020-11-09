package levelup.homework5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalculatorIT extends BaseCalculatorIT {

    @Test(dataProvider = "isNegativeDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void calculatorIsNegativeTest(long a, boolean expected) {
        boolean actual = calculator.isNegative(a);
        Assert.assertEquals(actual, expected);
    }
}
