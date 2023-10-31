import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class bai5 {
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
        var results = new ArrayList<Double>();
        var c = List.copyOf(a);
        Collections.sort(a);

        for (int k = a.size(); k > 0; k--) {
            if (k % 2 == 0) {
                results.add(((double) a.get(k / 2) + a.get((k / 2) - 1)) / 2.0);
            } else {
                results.add((double) a.get(k / 2));
            }
            a.remove(Collections.binarySearch(a, c.get(k - 1)));
        }
        Collections.reverse(results);
        return results;
    }
}
