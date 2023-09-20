public class Main {
    public static int binarySearch(int[] a, int number) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == number)
                return m;

            if (a[m] < number)
                l = m + 1;

            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,6,7};
        int b=5;
        System.out.println(binarySearch(a,b));
    }
}