//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
// 则经过替换之后的字符串为We%20Are%20Happy。
public class Practice44 {
    public static String replaceSpace(String str) {
        if(str==null){
            return null;
        }
       StringBuffer str1= new StringBuffer();

        for(int i = 0;i<str.length();i++){
           if(str.charAt(i) ==' '){
            str1.append('%');//append相当于拼接
             str1.append('2');
             str1.append('0');

           }else{
               str1.append(str.charAt(i));
           }
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        String s=replaceSpace("We Are Happy");
        System.out.println(s);
    }
}