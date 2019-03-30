package validation;

public class NumberValidation {
    public boolean isNotInRange(int rangeStart, int rangeEnd, int comparator) {
        return !(comparator >= rangeStart && comparator <= rangeEnd);
    }

    public boolean isPrime(int number) {
        if(number == 1)
            return  false;

        var halfNumber = number / 2;
        for(var factor = 2; factor <= halfNumber; ++factor) {
            if (number % factor == 0)
                return false;
        }

        return true;
    }
}
