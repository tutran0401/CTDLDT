
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Cell {
    public int r, c;
    public Cell(int i, int j) {
        r = i;
        c = j;
    }
}

public class ConnectedCellsinaGrid {

    static int[][] grid;
    static boolean[][] visited;
    static int N, M;


    static int count_connected(int row, int col) {
        int cnt = 0;

        // Viết chương trình vào đây

        return cnt;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                grid[i][j] = scanner.nextInt();
                visited[i][j] = false;
            }
        }
        int max = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (grid[i][j] == 0 || visited[i][j]) continue;
                int cnt = count_connected(i, j);
                if (max < cnt) max = cnt;
            }
        }

        System.out.println(max);

    }
}
//    private static int recurCountConnected(int i, int j, List<List<Integer>> matrix) {
//        if (i < 0 || j < 0 || i >= matrix.size() || j >= matrix.get(i).size() || matrix.get(i).get(j)==0) {
//            return 0;
//        }
//        int count = 0;
//        if (matrix.get(i).get(j)==1) {
//            count = 1;
//            matrix.get(i).set(j, 0);
//            count += recurCountConnected(i-1, j-1, matrix);
//            count += recurCountConnected(i-1, j, matrix);
//            count += recurCountConnected(i-1, j+1, matrix);
//            count += recurCountConnected(i, j-1, matrix);
//            count += recurCountConnected(i, j, matrix);
//            count += recurCountConnected(i, j+1, matrix);
//            count += recurCountConnected(i+1, j-1, matrix);
//            count += recurCountConnected(i+1, j, matrix);
//            count += recurCountConnected(i+1, j+1, matrix);
//        }
//        return count;
//
//    }
