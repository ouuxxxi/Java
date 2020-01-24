import java.util.Arrays;
//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
public class sortedSquares {
    public static int[] sortedSquares(int[] A){
        for (int i = 0; i <A.length ; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
    public static void main(String[] args) {
      int[]A={-4,-1,0,3,10};
      sortedSquares(A);
      System.out.println(Arrays.toString(A));
    }
}
