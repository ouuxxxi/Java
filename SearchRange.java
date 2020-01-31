import java.util.Arrays;
//在排序数组中查找元素的第一个和最后一个位置
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid=(left+right)/2;
        while (left<=right){   //正常二分查找
           mid=(left+right)/2;
           if (nums[mid]==target)
           {
               break;
           }
           if (nums[mid]<target){
               left=mid+1;
           }
           else {
               right=mid-1;
           }
        }
        if (nums.length==0||nums[mid]!=target){
            return new int[]{-1,-1};  //排除空数组 及目标不存在的情况
        }
        int i=mid,j=mid;
        while (i <nums.length && nums[i]==target ) {
            i++;//寻找边界
        }
        while (j >=0 && nums[j]==target ){
            j--;
        }
        int[] A={j+1,i-1};
        return A;

    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[]s=searchRange(nums,8);
        System.out.println(Arrays.toString(s));

    }
}
