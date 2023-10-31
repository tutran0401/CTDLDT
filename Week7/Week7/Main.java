public class Main {
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int pivot = arr.get(0);
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=pivot) {
                l.add(arr.get(i));
            } else {
                r.add(arr.get(i));
            }
        }
        l.add(pivot);
        for(int i=0;i<r.size();i++){
            l.add(r.get(i));
        }
        return l;
    }
}