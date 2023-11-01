import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Map<String, Integer> mappie = new HashMap<>();

        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            mappie.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s=in.nextLine();
            Integer number = mappie.get(s);
            System.out.println(number != null ? s+"="+number : "Not found");
        }
    }
}
