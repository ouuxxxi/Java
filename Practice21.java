
//搜索插入位置
public class Practice21 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));

    }
}
