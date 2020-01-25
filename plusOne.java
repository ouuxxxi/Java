import java.util.Arrays;

//数组中最后一个元素加一：输入: [1,2,3] 输出: [1,2,4]
//解释: 输入数组表示数字 123。
public class plusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9)
            {
                digits[i]+=1;
                return digits;
            }
            else
            {
                digits[i]=0;//等于9置为0
            }

        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
    public static void main(String[] args) {
      int[] digits={1,2,3};
      plusOne(digits);
      System.out.println(Arrays.toString(digits));
    }
}
