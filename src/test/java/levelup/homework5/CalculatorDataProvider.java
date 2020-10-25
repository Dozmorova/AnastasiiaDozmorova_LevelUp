package levelup.homework5;
import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    @DataProvider
    public Object[][] sumLongDataProvider() {
        return new Object[][] {
                {5000L, 4000L, 9000L},
                {394L, 6L, 400L},
                {-100L, 10L, -90L}
        };
    }
    
    @DataProvider
    public Object[][] sumDoubleDataProvider() {
        return new Object[][] {
                {4.5, 1.0, 5.5},
                {12.93, -4.40, 8.53},
                {123.78, 14.14, 137.92}
        };
    }

    @DataProvider
    public Object[][] subLongDataProvider() {
        return new Object[][] {
                {5000L, 4000L, 1000L},
                {394L, 6L, 388L},
                {-100L, 10L, -110L}
        };
    }

    @DataProvider
    public Object[][] subDoubleDataProvider() {
        return new Object[][] {
                {4.5, 1.0, 3.5},
                {12.93, -4.40, 17.33},
                {123.78, 14.14, 109.64}
        };
    }

    @DataProvider
    public Object[][] multLongDataProvider() {
        return new Object[][] {
                {50L, 40L, 2000L},
                {394L, 6L, 2364L},
                {-100L, 10L, -1000L}
        };
    }

    @DataProvider
    public Object[][] multDoubleDataProvider() {
        return new Object[][] {
                {4.5, 1.0, 4.5},
                {12.93, -4.40, -56.892},
                {123.78, 14.14, 17850.2492}
        };
    }

    @DataProvider
    public Object[][] divDataProvider() {
        return new Object[][] {
                {4.5, 1.0, 4.5},
                {12.9, -2.00, -6.45},
                {123.78, 14.14, 8.753889}
        };
    }

    @DataProvider
    public Object[][] powDataProvider() {
        return new Object[][] {
                {4.0, 2.0, 16.0},
                {8.5, 3.0, 614.125},
                {123.78, 0.0, 1.0}
        };
    }

    @DataProvider
    public Object[][] sqrtDataProvider() {
        return new Object[][] {
                {64.0, 8.0},
                {8.5, 2.9154759},
                {123.78, 11.1256460}
        };
    }

    @DataProvider
    public Object[][] tgDataProvider() {
        return new Object[][] {
                {64.0, 2.34786},
                {8.5, -1.326364},
                {-123.78, -3.090818}
        };
    }

    @DataProvider
    public Object[][] ctgDataProvider() {
        return new Object[][] {
                {64.0, 0.425919},
                {8.5, -0.75394},
                {6, -3.436353}
        };
    }

    @DataProvider
    public Object[][] cosDataProvider() {
        return new Object[][] {
                {60.0, -0.9524},
                {8.5, -0.60201},
                {-0.58, 0.836462}
        };
    }

    @DataProvider
    public Object[][] sinDataProvider() {
        return new Object[][] {
                {60.0, -0.3048106},
                {8.5, 0.79848711},
                {-0.58, -0.5480239}
        };
    }

    @DataProvider
    public Object[][] isPositiveDataProvider() {
        return new Object[][] {
                {60, true},
                {-100, false},
                {0, false}
        };
    }

    @DataProvider
    public Object[][] isNegativeDataProvider() {
        return new Object[][] {
                {60, false},
                {-100, true},
                {0, false}
        };
    }
}
