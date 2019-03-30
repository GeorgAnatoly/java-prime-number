package validation;

import java.util.regex.Pattern;

public class StringValidation {
    public boolean isNumber(String number) {
        return Pattern.matches("[0-9]", number);
    }
}
