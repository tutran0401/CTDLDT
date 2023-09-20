import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        /*int count = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            int diff;
            for (int j =i+1; j < arr.size(); j++){
                if(j == i ) break;
                diff = arr.get(j)- arr.get(i);
                if(diff != k ) continue;
                else count ++;
                }
            }
            return count;
        }*/
        int i = 0;
        int j = i + 1;
        int diff;
        int count = 0;
        Collections.sort(arr); // 1 2 3 4 5
        while (i < arr.size() && j < arr.size()) {
            diff = arr.get(j) - arr.get(i);

            if (diff == k) {

                i++;
                count++;

            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
        }
        return count;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
