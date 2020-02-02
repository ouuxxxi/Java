import java.util.Arrays;

//给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
//你找到的子数组应是最短的，请输出它的长度。
public class FindUnsortedSubarray {
    public static int findUnsortedSubarray(int[] nums){
         if(nums.length==0 || nums.length==1){
             return  0;
         }

         int start=0; int end = 0; int count=0;
         int[] nums1=Arrays.copyOf(nums,nums.length);//拷贝一个数组与nums相同
         Arrays.sort(nums1);
        //比较相同位置nums1与nums的值是否相同：相同 count++;
        //记录最开始不一样的下标start以及最后一个不一样的值所对应的下标end; end-start+1即为所求值
        for (int i = 0; i <nums.length ; i++) {

         if(nums[i]-nums1[i]==0){ //如果两个值相等
             continue;
         }
         else {  //两个值不相等
           count++;
           end=i;//记录最后一个不一样的值的下标

             if(count==1){
                 start=i;//记录第一个不一样的值下标
             }
         }
        }
        return count==0? 0 :(end-start+1); //count=0时 表示整个数组一开始就是升序的
    }

    public static void main(String[] args) {
        int[] nums={ 2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));


    }
}
