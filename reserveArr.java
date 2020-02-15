import java.util.Arrays;

//数组的反转
public class reserveArr {
    public static void main(String[] args) {
        int[] arr = {10,260,90,60,58};
        System.out.println("初始数组：" + Arrays.toString(arr));
        //数组反转结束：如果是奇数 min==max； 偶数：min>max
        int min =0, max=arr.length-1;
        while ( min<max) {
           int temp = arr[min];
           arr[min] = arr[max];
           arr[max] = temp;
           min++;
           max--;
        }
        System.out.println("逆转后的数组：" +Arrays.toString(arr));
    }
}
