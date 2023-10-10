import java.util.Scanner;
import java.util.Stack;

public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String text = "";
        Stack<String> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            int hoatdong = input.nextInt();
            switch (hoatdong) {
                case 1:
                    s.push(text);
                    String them = input.next();
                    text += them;
                    break;
                case 2:
                    s.push(text);
                    int k = input.nextInt();
                    String moi = text.substring(0, text.length() - k);
                    text = moi;
                    break;
                case 3:
                    int l = input.nextInt();
                    System.out.println(text.charAt(l - 1));
                    break;
                case 4:
                    if (!s.isEmpty()) {
                        String oldText = s.pop();
                        text = oldText;
                        break;
                    }
            }
        }
        input.close();
    }
}
