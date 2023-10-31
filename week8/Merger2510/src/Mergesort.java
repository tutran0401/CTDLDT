public class Mergesort {
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
    public static void print(int[] arr){
        for (int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13 , 5, 6, 7};
        System.out.print("mang ban dau: ");
        print(arr);
        int[] sortArr = mergeSort(arr);
        System.out.print("\nsau khi sap xep: ");
        print(sortArr);
    }
}



