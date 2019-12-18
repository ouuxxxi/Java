//分割数组
public class Practice22 {
    public  static int part(int[] A) {
        int i=0;
        int leftMax = A[i];
        int rightMin = A[i];
        int index = 0;//
        for (i = 0; i < A.length; i++) {
            if (A[i] < rightMin) {
                rightMin = leftMax;
                index=i;
                leftMax = Math.max(leftMax, A[i]);
            }
        }
        return index + 1;
     }

    public static void main(String[] args) {
        int[]A={5,0,3,8,6};
        System.out.println(part(A));
    }

}
