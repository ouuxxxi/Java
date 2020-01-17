import java.util.Arrays;

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
public class Practice19 {
   /*

   //方法①：
    public static void rotate(int[] nums, int k) {
       for (int i = 0; i <k; i++) {

           //先将最后一个元素保存在temp中
          int temp=nums[nums.length-1];

          //从倒数第二个元素开始，后一个元素等于前一个元素
        for(int j=nums.length-2;j>=0;j--){
            nums[j+1]=nums[j];
        }

        //将最后一个元素的值赋给0号元素
        nums[0]=temp;
        }

        */

   //方法②
   public static void rotate(int[] nums, int k) {
       int nums1[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
          int num = (i+k) % nums1.length;
          nums1[num]=nums[i];//0号下标的元素变成了3 以此类推
       }
       for(int i=0;i<nums1.length;i++){
           nums[i] = nums1[i];
       }
    }

    public static void main(String[] args) {
       int[] nums={1,2,3,4,5,6,7};
       int k=3;
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
