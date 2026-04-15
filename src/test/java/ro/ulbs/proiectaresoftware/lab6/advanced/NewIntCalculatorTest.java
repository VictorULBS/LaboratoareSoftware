package ro.ulbs.proiectaresoftware.lab6.advanced;
import org.junit.jupiter.api.*;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new NewIntCalculator();
    }

    @Test
    public void testAdd() {
        calculator.init();

        calculator.add(1);

        Assertions.assertTrue(calculator.result() == 1);
    }

    @Test
    public void testSubtract() {
        calculator.init();

        calculator.subtract(1);

        Assertions.assertTrue(calculator.result() == -1);
    }

    @Test
    public void testClear() {
        calculator.init();

        calculator.clear();

        Assertions.assertTrue(calculator.result() == null);
    }

    @Test
    public void testMultiply() {
        calculator.init();

        calculator.add(2);
        calculator.multiply(3);

        Assertions.assertTrue(calculator.result() == 6);
    }

    @Test
    public void testDivide() {
        calculator.init();

        calculator.add(6);
        calculator.divide(2);

        Assertions.assertTrue(calculator.result() == 3);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}















