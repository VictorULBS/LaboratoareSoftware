package ro.ulbs.proiectaresoftware.lab6.advanced;
import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    public void init() {
        calculator = new DoubleCalculator();
    }

    @Test
    public void testAdd() {
        calculator.init();

        calculator.add(1.3);

        Assertions.assertTrue(calculator.result() == 1.3);
    }

    @Test
    public void testSubtract() {
        calculator.init();

        calculator.subtract(1.3);

        Assertions.assertTrue(calculator.result() == -1.3);
    }

    @Test
    public void testDivide() {
        calculator.init();

        calculator.add(5.0);
        calculator.divide(2.0);

        Assertions.assertTrue(calculator.result() == 2.5);
    }

    @Test
    public void testMultiply() {
        calculator.init();

        calculator.add(2.0);
        calculator.multiply(2.3);

        Assertions.assertTrue(calculator.result() == 4.6);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}



