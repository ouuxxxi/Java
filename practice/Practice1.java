
public class Practice1 {
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int[] arr = new int[m+n];//定义一个新的数组，长度为两个原数组长度之和
        int i=0;int j=0;int p=0;//定义三个指针，分别指向三个数组的第一个元素
        while(i<m && j<n){
            //当指针位置小于数组长度时，比较两个数组的元素的大小，小的放入新数组
            if(nums1[i]<nums2[j]){
                arr[p++]=nums1[i++];
            }else{
                arr[p++]=nums2[j++];
            }
        }
        if(i>=m){ //第一个数组遍历完成，直接将数组2放入新数组中
            while(j<n){
                arr[p++]=nums2[j++];
            }
        }
       if(j>=n){
            while(i<m){
                arr[p++]=nums1[i++];
            }
        }
        for(int k=0;k<arr.length;k++){
            nums1[k]=arr[k];//将新数组的元素依次赋值给nums1
            System.out.println(nums1[k]);
        }
    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        merge(nums1,3,nums2,3);
    }
}
