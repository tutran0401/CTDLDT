import java.util.List;

public class bai5 {
    public static void printArr(List<Integer> arr){
        for(int index : arr){
            System.out.print(index+" ");
        }
        System.out.println();
    }
    public static void insertIntoSorted(int n, List<Integer> arr){
        for (int i=1;i<n;i++){
            int count = arr.get(i);
            int j=i-1;
            while (j>=0 && arr.get(j)> count){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,count);
            printArr(arr);
        }
    }
}
