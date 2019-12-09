//输入一个字符串，求出该字符串包含的字符集合 重复出现并靠后的字母不输出
//例如：abcdefghabc  结果：abcdefgh
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;
            while(input.hasNext())//循环读入
            {
                String str = input.nextLine();
                StringBuilder a = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char temp = str.charAt(i);//字符
                    if (!a.toString().contains(temp + "")) {
                        //StringBuilder是没有cntains方法的，必须将它转化为字符串类型
                        //temp是字符 拼接一个字符串 就是字符串；temp拼接一个空的字符串
                        a.append(temp);
                    }
                }
            }
        System.out.println(args.toString());
        }
    }

