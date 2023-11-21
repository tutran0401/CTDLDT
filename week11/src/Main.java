import java.util.TreeMap;

public class Main {
    public static double findMedian(TreeMap<Integer,Integer> treeMap, int size){
        if(size%2==1){
            int index = size/2 +1;
            return findKthelement(treeMap,index);
        }else {
            int index1= size/2;
            int index2= size/2+1;
            double num1 = findKthelement(treeMap,index1);
            double num2 =findKthelement(treeMap,index2);
            return (num2+num1)/2;
        }
    }
    public static double findKthelement(TreeMap<Integer,Integer> treeMap, int k){
        int count = 0;
        for(int key:treeMap.keySet()){
            count += treeMap.get(key);
            if (count>=k){
                return key;
            }
        }
        return -1;// khong tim thay
    }
}