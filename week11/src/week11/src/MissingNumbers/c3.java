package week11.src.MissingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class c3 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> res = new ArrayList<Integer>();
        int minB = Collections.min(brr);
        int check[] = new int[101];
        TreeSet<Integer> missingSet = new TreeSet<>();
        for (int i = 0 ; i < 101; i++) check[i] = 0;
        for (int i : arr) {
            check[i - minB] ++;
        }
        for (int i : brr) {
            check[i - minB] --;
        }
        for (int i : brr) {
            if (check[i - minB] < 0) missingSet.add(i);
        }
        res.addAll(missingSet);
        return res;
    }
}

