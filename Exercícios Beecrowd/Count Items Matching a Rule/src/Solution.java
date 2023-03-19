import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        final int ruleKeyIndex = itemMap.get(ruleKey);

        return (int) items.stream()
                .map(item -> item.get(ruleKeyIndex))
                .filter(attribute -> attribute.equals(ruleValue))
                .count();
    }

    public final Map<String, Integer> itemMap = new HashMap<>() {
        {
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }
    };
}
