import java.util.Scanner;
//十六进制转十进制
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();
        int len =arr.length-1;
        long sum = 0;

        for (int i = 0; i <str.length() ; i++) {
            if(arr[i]-48>9){   //字符0到9 ：48——57
                if(arr[i]=='A'){
                    sum+=10* Math.pow(16,len-i);
                }else if(arr[i]=='B'){
                    sum+=11* Math.pow(16,len-i);
                }else if(arr[i]=='C'){
                    sum+=12* Math.pow(16,len-i);
                }else if(arr[i]=='D'){
                    sum+=13* Math.pow(16,len-i);
                }else if(arr[i]=='E'){
                    sum+=14* Math.pow(16,len-i);
                }else if(arr[i]=='F'){
                    sum+=15* Math.pow(16,len-i);
                }
            }else{
                sum+=(arr[i]-48)*Math.pow(16,len-i);
            }

        }
        System.out.println(sum);
    }
}
