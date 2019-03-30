package validation;

import java.util.regex.Pattern;

public class SequenceValidation {
    public boolean numberSingleSpacePattern(String numberSequence) {
        return Pattern.matches("(\\d+\\s+)+", numberSequence);
    }
}
