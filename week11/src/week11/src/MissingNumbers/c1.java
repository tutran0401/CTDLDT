package week11.src.MissingNumbers;

import java.util.*;

public class c1 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        TreeSet<Integer> missingSet = new TreeSet<>();
        for (int num : brr) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                missingSet.add(num);
            } else {
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        result.addAll(missingSet);
        return result;
    }
}
