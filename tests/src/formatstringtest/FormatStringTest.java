package formatstringtest;

import org.junit.jupiter.api.Test;
import stringformating.FormatString;
import validation.SequenceValidation;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FormatStringTest {
    /*
     TODO not sure how to write the class or test
     so that unit test validates only a digit, single space
     pattern is maintained - use regex \d+\s
    */
    @Test
    void returnTrueForNumArrayToNumberSingleSpaceStringPattern() {
        var array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);

        var formatString = new FormatString();
        var sequenceValidation = new SequenceValidation();
        var numArrayToString = formatString.numberSingleSpacePattern(array);

        var result = sequenceValidation.numberSingleSpacePattern(numArrayToString);

        assertTrue(result);
    }
}
