import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        if(arr == null || arr.size()<2){
            return new ArrayList<>();
        }
        int maxInt = Integer.MAX_VALUE;
        List<Integer> results = new ArrayList<>();
        arr.sort(null);
        for(int i =0;i< arr.size()-1;i++){
            int diff = arr.get(i+1) - arr.get(i);
            if(diff < maxInt){
                results.clear();
                results.add(arr.get(i));
                results.add(arr.get(i+1));
                maxInt = diff;
            }else if(diff == maxInt){
                results.add(arr.get(i));
                results.add(arr.get(i+1));
            }
        }
        return  results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.closestNumbers(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
