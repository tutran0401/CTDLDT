import java.util.*;
import java.io.*;

public class bai6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi văn bản:");
        String input = scanner.nextLine();

        List<String> words = new ArrayList<>(Arrays.asList(input.split("\\s+")));
        Collections.sort(words);

        String prevWord = words.get(0);
        int count = 1;
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).equals(prevWord)) {
                count++;
            } else {
                System.out.println(prevWord + ": " + count);
                prevWord = words.get(i);
                count = 1;
            }
        }
        System.out.println(prevWord + ": " + count);
    }
}
