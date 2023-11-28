import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Timdaycon {
    public static Hashtable<Integer, Integer> Timdayconlonnhat(int[] num) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = -1;
        int i = 0;
        while (i < num.length) {
            currentSum = num[i];
            hashtable.put(i, currentSum);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            for (int j = i + 1; j < num.length; j++) {
                currentSum += num[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            hashtable.put(i, maxSum);
            i++;
            maxSum = 0;
        }
        return hashtable;
    }

    public static int findMaxValue(Hashtable<Integer, Integer> hashtable) {
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : hashtable.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("day so ban dau: ");
        for (int so : a) {
            System.out.print(so + " ");
        }
        System.out.print("\n");
        Hashtable<Integer, Integer> result = Timdayconlonnhat(a);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("tong day so lien tiep lon nhat la: " + findMaxValue(result));


    }
}
