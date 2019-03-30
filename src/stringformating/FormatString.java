package stringformating;

import java.util.ArrayList;

public class FormatString {
    public String numberSingleSpacePattern(ArrayList<Integer> numberArray) {
        var output = new StringBuilder();

        for (Integer number: numberArray)
            output.append(number).append(" ");

        return output.toString();
    }
}
