package stringvalidationtest;

import org.junit.jupiter.api.Test;
import validation.StringValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidationTest {
    @Test
    void returnTrueForNonNumericString() {
        var nonNumber = ",1";
        var stringCheck = new StringValidation();

        var result = stringCheck.isNotNumber(nonNumber);

        assertTrue(result);
    }

    @Test
    void returnFalseForNumericString() {
        var numberString = "2";
        var stringCheck = new StringValidation();

        var result = stringCheck.isNotNumber(numberString);

        assertFalse(result);
    }

    @Test
    void returnFalseForMultiDigitNumber() {
        var numberString = "28";
        var stringCheck = new StringValidation();

        var result = stringCheck.isNotNumber(numberString);

        assertFalse(result);
    }
}
