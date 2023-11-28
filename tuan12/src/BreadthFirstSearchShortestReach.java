import java.util.*;

public class BreadthFirstSearchShortestReach {

    static int[] findShortestReach(ArrayList<ArrayList<Integer>> graph, int start) {
        int[] costs = new int[graph.size()];
        int UNIT_COST = 6;
        for (int i = 0; i < costs.length; ++i) costs[i] = -1;

        // Viết chương trình vào đây

        return costs;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for (int q = 0; q < Q; ++q) {
            int N, M, start;
            N = scanner.nextInt();
            M = scanner.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i <= N; ++i) {
                graph.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < M; ++i) {
                int n1, n2;
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                graph.get(n1).add(n2);
                graph.get(n2).add(n1);
            }
            start = scanner.nextInt();
            /*
            for (int i = 0; i < N; ++i) {
                Collections.sort(graph.get(i));
            }
            for (int i = 1; i <= N; ++i) {
                System.out.println("Node: " + i);
                System.out.println(graph.get(i).toString());
            }
            System.out.println("Start: " + start);
            */
            int[] costs = findShortestReach(graph, start);
            for (int i = 1; i < costs.length; ++i) {
                if (i == start) continue;
                System.out.print(costs[i] + " ");
            }
            System.out.println();
        }
    }
}
//    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
//        // Write your code here
//        List<Integer> dist = new ArrayList<>();
//        IntStream.range(0,n+1).forEach(x -> dist.add(-1));
//        int graph[][]= new int[n+1][n+1];
//        for(int i=0;i<m;i++){
//            int a = edges.get(i).get(0);
//            int b = edges.get(i).get(1);
//            graph[a][b]=6;
//            graph[b][a]=6;
//        }
//        boolean visited[]= new boolean[n+1];
//        visited[0]=true;
//        Queue<Integer> que = new LinkedList<>();
//        que.add(s);
//        visited[s]=true;
//        while (!que.isEmpty()){
//            int node = que.poll();
//            for(int i=0;i<n+1;i++){
//                if (!visited[i] && graph[node][i]!=0){
//                    que.add(i);
//                    visited[i]=true;
//                    if (dist.get(node)==-1){
//                        dist.set(i,graph[node][i]);
//                    } else{
//                        dist.set(i,dist.get(node)+graph[node][i]);
//                    }
//                }
//            }
//        }
//        dist.remove(s);
//        dist.remove(0);
//        return dist;
//    }