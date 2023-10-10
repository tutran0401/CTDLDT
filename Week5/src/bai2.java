import java.util.Stack;
public class bai2 {
    public static String isBalanced(String str) {
            // Write your code here
            int chieuDai = str.length();
            if(chieuDai%2==1) return "NO";
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (a == '(' || a == '{' || a == '[') {
                    stack.push(a);
                } else {
                    if (stack.isEmpty()) {
                        return "NO";
                    }
                    char top = stack.pop();
                    if ((a == ')' && top != '(') || (a == ']' && top != '[') || (a == '}' && top != '{')) {
                        return "NO";
                    }
                }
            }

            return stack.isEmpty() ? "YES" : "NO";
        }
}

