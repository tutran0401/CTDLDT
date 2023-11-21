import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pair {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int ans = 0;
        Set<Integer> st = new HashSet<>();
        for (int i : arr) {
            if (st.contains(i + k)) ans++;
            if (st.contains(i - k)) ans++;
            st.add(i);
        }
        return ans;
    }
}