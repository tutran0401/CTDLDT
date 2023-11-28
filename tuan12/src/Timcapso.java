import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Timcapso {
    public static Hashtable<Integer,Integer> timcapso(int[] num,int sumtaget){
        Hashtable<Integer,Integer> result = new Hashtable<>();
        for(int i = 0;i< num.length-1;i++){
            for (int j=i+1;j< num.length;j++){
                if(num[i] + num[j] == sumtaget){
                    result.put(num[i],num[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tong=input.nextInt();
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
        Hashtable<Integer, Integer> result = timcapso(a,tong);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("(" + entry.getKey() + "," + entry.getValue()+")");
        }
    }
}
