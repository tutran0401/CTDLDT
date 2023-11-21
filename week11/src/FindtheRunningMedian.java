import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class  FindtheRunningMedian {
    static class Node implements Comparable<Node> {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Node o) {
            if (this.value == o.value) {
                return this.index - o.index;
            }
            return this.value - o.value;
        }
    }

    public static List<Double> runningMedian(List<Integer> a) {
        TreeSet<Node> left = new TreeSet<>((a1, a2) -> a2.compareTo(a1));
        TreeSet<Node> right = new TreeSet<>();
        List<Double> res = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            Node node = new Node(a.get(i), i);

            if (left.size() <= right.size()) {
                right.add(node);
                left.add(right.pollFirst());
            } else {
                left.add(node);
                right.add(left.pollFirst());
            }

            if (left.size() == right.size()) {
                res.add((double) (left.first().value + right.first().value) / 2);
            } else {
                res.add((double) left.first().value);
            }
        }

        return res;
    }
}