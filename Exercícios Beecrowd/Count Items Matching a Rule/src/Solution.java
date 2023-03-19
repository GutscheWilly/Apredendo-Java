import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int numberOfItemsMatches = 0;
        int ruleKeyIndex = itemMap.get(ruleKey);

        for (List<String> item : items) {
            String attribute = item.get(ruleKeyIndex);

            if (attribute.equals(ruleValue)) {
                numberOfItemsMatches++;
            }
        }

        return numberOfItemsMatches;
    }

    public static Map<String, Integer> itemMap = new HashMap<>() {
        {
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }
    };
}
