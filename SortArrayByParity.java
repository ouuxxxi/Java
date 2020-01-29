import java.util.Arrays;
//按奇偶排序数组:奇数在前 偶数在后
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A){
        int[] B = new int[A.length];
        int p=0;
        int k=B.length-1;
        for(int i=0;i<A.length;i++){

            if(A[i]%2==0){
                B[p++]=A[i];
            }else{
                B[k--]=A[i];//k-- 先用在执行  B[3]=A[0]  3放在B数组的3号位值

            }

        }

        return B;
    }

    public static void main(String[] args) {
        int[] A={3,1,2,4};
       int[]C=sortArrayByParity(A);
        System.out.println(Arrays.toString(C));
    }
}
