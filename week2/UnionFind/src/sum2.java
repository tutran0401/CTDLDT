import java.util.*;
import edu.princeton.cs.algs4.*;
public class sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi số nguyên (cách nhau bằng khoảng trắng): ");
        String input = scanner.nextLine();
        scanner.close();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            try {
                nums[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.println("Chuỗi không hợp lệ: " + numbers[i]);
            }
        }
        findParirs(nums);
    }

    public static void findParirs(int[] nums) {
        Arrays.sort(nums);
        int left=0 , right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == 0){
                System.out.println(nums[left] + " " + nums[right]);
                left++;
                right--;
            }else if(sum > 0) {
                right --;
                //while(right== right++) right++;
            }else {
                left++;
                //while (left==left--) left--;
            }
        }
    }
}
