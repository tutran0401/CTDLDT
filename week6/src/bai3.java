import java.util.List;

public class bai3 {
    public static void printArr(List<Integer> arr){
        for(int index : arr){
            System.out.print(index+" ");
        }
        System.out.println();
    }
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int luu = arr.get(n-1);
        for(int i = n-1;i>=0;i--){
            if(luu < arr.get(i-1)){
                arr.set(i,arr.get(i-1));
                printArr(arr);
            }else{
                arr.set(i,luu);
                printArr(arr);
                break;
            }
        }
    }
}
