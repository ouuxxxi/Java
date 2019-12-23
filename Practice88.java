//删除排序数组中的重复项
public class Practice88 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) { //判断数组是否为空
            return 0;
        }
        int fast=1, slow = 0; //设置快慢指针
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[slow+1] = nums[fast]; //不相等  慢指针往前走
                slow++;
            }
            fast++;
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int[]nums={1,1,2,3,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
