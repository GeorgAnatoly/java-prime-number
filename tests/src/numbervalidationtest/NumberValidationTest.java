package numbervalidationtest;

import org.junit.jupiter.api.Test;
import validation.NumberValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberValidationTest {
    @Test
    void returnTrueForNumIsInRangeLessThan() {
        var number = -5;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isNotInRange(1, 10, number);

        assertTrue(result);
    }

    @Test
    void returnTrueForNumIsInRangeGraterThan() {
        var number = 100;
        var numberVaidation = new NumberValidation();

        var result = numberVaidation.isNotInRange(1, 10, number);

        assertTrue(result);
    }

    @Test
    void returnFalseForNumIsInRange() {
        var number = 5;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isNotInRange(1, 5, number);

        assertFalse(result);
    }

    @Test
    void returnFalseForNumNotInRangeAtRangeStart() {
        var number = 1;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isNotInRange(1, 10, number);

        assertFalse(result);
    }

    @Test
    void returnFalseForNumNotInRangeAtRangeEnd() {
        var number = 10;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isNotInRange(1, 10, number);

        assertFalse(result);
    }

    @Test
    void returnTrueForIsPrime3() {
        var number = 3;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isPrime(number);

        assertTrue(result);
    }

    @Test
    void returnFalseForIsPrime1() {
        var number = 1;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isPrime(number);

        assertFalse(result);
    }

    @Test
    void returnFalseForIsPrime4() {
        var number = 4;
        var numberValidation = new NumberValidation();

        var result = numberValidation.isPrime(number);

        assertFalse(result);
    }
}
