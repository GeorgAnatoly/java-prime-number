package stringtest;

import org.junit.jupiter.api.Test;
import validation.StringValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidationTest {
    @Test
    void returnFalseForNonNumericString() {
        var nonNumber = ",1";
        var stringCheck = new StringValidation();

        var result = stringCheck.isNumber(nonNumber);

        assertFalse(result);
    }

    @Test
    void returnTrueForNumericString() {
        var numberString = "2";
        var stringCheck = new StringValidation();

        var result = stringCheck.isNumber(numberString);

        assertTrue(result);
    }
}
