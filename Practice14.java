import java.util.*;

//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数

public class Practice14 {
    public static void main(String[] args) {
        int letter=0;
        int blank=0;
        int num=0;
        int character=0;
        char[] c=null;

        Scanner input = new Scanner(System.in);
        String str=input.nextLine();

        c=str.toCharArray();

        for (int i = 0; i <c.length ; i++) {
            if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z'){
                letter++;
            } else if(c[i] == ' '){
                blank++;
            }else if(c[i]>='0' && c[i]<='9'){
                num++;
            }else{
                character++;
            }
        }

        System.out.println("数字个数"+num);
        System.out.println("空格个数"+blank);
        System.out.println("字母个数"+letter);
        System.out.println("其他字符个数"+character);
    }
}
