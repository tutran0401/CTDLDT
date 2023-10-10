import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Queue<Integer> s = new LinkedList<>();
        while (a-- > 0){
            int type = input.nextInt();
            switch (type){
                case 1:
                    int sothem = input.nextInt();
                    s.offer(sothem);// them vao cuoi queue
                    break;
                case 2:
                    if(!s.isEmpty()){
                        s.poll();
                    }
                    break;
                case 3:
                    if(!s.isEmpty()){
                        System.out.println(s.peek());
                    }
                    break;
            }
        }
        input.close();
    }
}
