import java.util.Arrays;


   public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("最大值:" + maxArr(arr));
        System.out.println("最小值:" + minArr(arr));
        System.out.println("平均值:" + aveArr(arr));
        System.out.println("数组逆置:" + Arrays.toString(reverseArr(arr)));
        System.out.println("数组逆置:" + Arrays.toString(numArr(arr)));

    }

    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int aveArr(int[] arr) {
        int ave = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ave = sum / arr.length;
        }
        return ave;
    }

    public static int[] reverseArr(int[] arr) {
        int ret[] = new int[arr.length];
        for (int j = 0; j < arr.length / 2; j++) {
            ret[j] = arr[arr.length - 1 - j];
        }
        return ret;
    }

    public static int[] numArr(int[] arr) {
        int left = 0;
        int right = arr.length - 1;//代表的是下标
        while (left < right) {
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int tmp= arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return arr;
    }

 }