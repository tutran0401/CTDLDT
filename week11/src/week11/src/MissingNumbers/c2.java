package week11.src.MissingNumbers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c2 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        Collections.sort(arr);
        Collections.sort(brr);
        int i = 0, j = 0;
        while (i < arr.size() && j < brr.size()) {
            if (arr.get(i).equals(brr.get(j))) {
                i++;
                j++;
            } else {
                while (j < brr.size() && brr.get(i).equals(brr.get(j + 1)))j++;
                res.add(brr.get(j++));
            }
        }
        while (j < brr.size()) {
            while (j < brr.size() - 1 && brr.get(i).equals(brr.get(j + 1)))j++;
            res.add(brr.get(j++));
        }
        Collections.sort(res);
        return res;
    }
}