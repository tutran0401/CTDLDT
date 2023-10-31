import java.io.*;
import java.util.*;

public class Solution {
    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivotIdx = l;
        for (int i = l; i < r; i++) {
            if (arr[i] <= arr[r]) {
                exch(arr, i, pivotIdx);
                pivotIdx++;
            }
        }
        exch(arr, r, pivotIdx);
        printArr(arr);
        return pivotIdx;
    }

    public static void sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivotIdx = partition(arr, l, r);
        sort(arr, l, pivotIdx - 1);
        sort(arr, pivotIdx + 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr, 0, n - 1);
    }
}
