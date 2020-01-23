import java.util.Arrays;

//给定一个整数数组，判断是否存在重复元素。
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        if(nums.length == 1){
            return false;
        }
        Arrays.sort(nums);//排序
        for(int i = 1; i < nums.length; i++){ //i从1开始 [1,2,3,4]
            if(nums[i-1] == nums[i]){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
       int[] nums= {1,2,3,4};
       boolean flag=containsDuplicate(nums);
       System.out.println(flag);
    }
}
