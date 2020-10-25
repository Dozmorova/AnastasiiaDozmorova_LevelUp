package levelup.homework5;

import org.testng.annotations.*;
import ru.levelup.qa.at.calculator.Calculator;

public abstract class BaseCalculatorIT {

    public static Calculator calculator;

    @BeforeSuite
    public void setUpTestMethod() {
        System.out.println("Set up Test Suit");
        calculator = new Calculator();
    }
    @AfterSuite
    public void tearDownTestMethod() {
        System.out.println("Tear down Test Suit");
        calculator = null;
    }
}
