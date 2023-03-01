package calctest;

import Task_JUnit.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private static Calculator calc;

    @BeforeAll
    public static void init() {
        calc = new Calculator();
        System.out.println("Init");
    }

    @BeforeEach
    public void log() {
        System.out.println("Test start");
    }

    @Test
    @DisplayName("Test addition 25+5")
    public void additionTest() {
        System.out.println("Test _ addition");
        int expected = 30;
        int actual = calc.addition(25, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test subtraction 30-5")
    public void subtractionTest() {
        System.out.println("Test _ subtraction");
        int expected = 25;
        int actual = calc.subtraction(30, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test multiplication 5*6")
    public void multiplicationTest() {
        System.out.println("Test _ multiplication");
        int expected = 30;
        int actual = calc.multiplication(5, 6);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test division 25/5")
    public void divisionTest() {
        System.out.println("Test _ division");
        int expected = 5;
        int actual = calc.division(25, 5);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("integerStreamProvider")
    public void additionTestWithParams(int a, int b, int result) {
        System.out.println("a:" + a + " b:" + b + " result:" + result);
        int actual = calc.addition(a, b);
        Assertions.assertEquals(result, actual);
    }

    public static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.arguments(10, 8, 18),
                Arguments.arguments(1, 18, 19),
                Arguments.arguments(7, 30, 37));
    }

    @AfterEach
    public void logAfter() {
        System.out.println("Test finish");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Done");
    }
}

