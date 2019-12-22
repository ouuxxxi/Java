//删除数组中所有值为val的元素

public class Practice77 {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }else{
                nums[i-count]=nums[i];//如果不是所要删除的元素，当前下标减去count次数
            }
        }
        return nums.length-count;//删除元素后的数组长度
    }

    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        System.out.println(removeElement(nums,3));//[2,2] 长度为2
    }
}
