import java.util.Arrays;
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int k= target - nums[i];
            for (int j = 0; j < nums.length; j++)
                if (nums[j]==k && i!=j) {
                    num[0]=i;
                    num[1]=j;
                    return num;
                }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] num = new int[2];
        int[] nums={2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(num));

    }
}
