package pl.emgie.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsEnhancements {

    private static final String[] sampleData = new String[]{"John", "George", "Alan"};

    public static List<String> immutableEmptyList() {
        return List.<String>of();
    }

    public static List<String> immutableList() {
        return List.of(sampleData);
    }

    public static Set<String> immutableSet() {
        return Set.of(sampleData);
    }

    public Map<Integer, String> immutableMap() {
        return Map.of(1, sampleData[0], 2, sampleData[1], 3, sampleData[2]);
    }


}
