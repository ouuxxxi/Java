//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，请返回 0
public class lengthOfLastWord {
     public static int lengthOfLastWord(String s){
         if(s==null){
             return 0;
         }
         int len=0;
         for (int i =s.length()-1;i>=0;i--) {
             if(s.charAt(i)!=' '){
                 len++;
             }else if(len!=0){
                 return len;
             }
         }
         return len;
    }
}
