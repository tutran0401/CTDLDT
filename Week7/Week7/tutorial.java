public class Main {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int l = 0, r = arr.size() - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (V == arr.get(m)) {
                return m;
            }
            if (arr.get(m) < V) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}