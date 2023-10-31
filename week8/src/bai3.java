public class bai3 {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(A);
        int iterations = 0;

        while (pq.size() > 0) {
            Integer lowest = pq.poll();
            if (lowest >= k) {
                return iterations;
            }
            Integer secondLowest = pq.poll();
            if (secondLowest != null) {
                final Integer combined = lowest + (2 * secondLowest);
                pq.offer(combined);
            } else {
                return -1; //this will only happen if 1 item left less than k
            }

            iterations++;
        }
}
