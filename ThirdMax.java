import java.util.Arrays;
//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)
public class ThirdMax {
    public static int thirdMax(int[] nums) {
             if(nums.length==1){
                 return nums[0];
             }
             if(nums.length==2){
                 return Math.max(nums[0],nums[1]);
             }
             Arrays.sort(nums);
             int count=0;
          for (int i = nums.length-1; i >0; i--) {
             if(nums[i-1]!=nums[i]){ //12345
                 count++;
                 if(count==3){
                     return nums[i];
                 }
             }
        }
        return nums[nums.length-1];//如果数组是[1,1,2]
    }
    public static void main(String[] args) {
       int[] nums={1,2,3,4,5};
       System.out.println(thirdMax(nums));
    }
}
