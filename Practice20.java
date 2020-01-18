import java.lang.reflect.Array;
import java.util.Arrays;

//移除元素
public class Practice20 {
   public static int removeElement(int[] nums, int val) {
        if(nums==null||nums.length<1){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                count++;
            }else{
                nums[i-count]=nums[i];//如果当前元素值不等于val，当前下标减去count次数
            }
        }
        return nums.length - count;
    }


    public static void main(String[] args) {
        int count = 0;
        int nums[]={3,2,2,3};
        int val=2;
        removeElement(nums,val);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length - count);
    }
}
