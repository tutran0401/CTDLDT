import java.util.ArrayList;
import java.util.List;

public class bai7 {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while ((i < left.length && j < right.length)) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    public static int[] mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        //copy phan tu vao mang left,right
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = arr[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        if(arr == null || arr.size()<2){
            return new ArrayList<>();
        }
        int[] intArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            intArr[i] = arr.get(i);
        }
        intArr = mergeSort(intArr);
        int maxInt = Integer.MAX_VALUE;
        List<Integer> results = new ArrayList<>();
        for(int i =0;i< intArr.length-1;i++){
            int diff = intArr[i+1] - intArr[i];
            if(diff < maxInt){
                results.clear();
                results.add(intArr[i]);
                results.add(intArr[i+1]);
                maxInt = diff;
            }else if(diff == maxInt){
                results.add(intArr[i]);
                results.add(intArr[i+1]);
            }
        }
        return  results;
    }

}

