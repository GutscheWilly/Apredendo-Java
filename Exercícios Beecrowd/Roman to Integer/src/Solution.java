import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int number = 0;
        int length = s.length();

        for (int i = 0; i < length - 1; i++) {
            int currentValue = romanNumerals.get(String.valueOf(s.charAt(i)));
            int nextValue = romanNumerals.get(String.valueOf(s.charAt(i + 1)));

            if (currentValue < nextValue) {
                number -= currentValue;
            } else {
                number += currentValue;
            }
        }

        int lastValue = romanNumerals.get(String.valueOf(s.charAt(length - 1)));
        number += lastValue;

        return number;
    }

    private final Map<String, Integer> romanNumerals = new HashMap<>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };
}
