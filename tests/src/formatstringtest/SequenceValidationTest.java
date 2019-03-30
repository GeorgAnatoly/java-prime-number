package formatstringtest;

import org.junit.jupiter.api.Test;
import validation.SequenceValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SequenceValidationTest {
    @Test
    void returnTrueForNumberThenSingleSpacePattern() {
        var numberSequence = "1 2 ";
        var sequenceValidation = new SequenceValidation();

        var result = sequenceValidation.numberSingleSpacePattern(numberSequence);

        assertTrue(result);
    }

    @Test
    void returnFalseForNumberThenSingleSpacePattern() {
        var numberSequence = "1 2";
        var sequenceValidation = new SequenceValidation();

        var result = sequenceValidation.numberSingleSpacePattern(numberSequence);

        assertFalse(result);
    }
}
