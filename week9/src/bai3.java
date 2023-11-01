import java.io.*;
import java.util.*;

public class bai3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        Set<String> pair=new HashSet<>();
        int n=Integer.parseInt(input.nextLine());
        while(input.hasNextLine()){
            pair.add(input.nextLine());
            System.out.println(pair.size());
        }
    }
}

