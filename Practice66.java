import java.util.ArrayList;
import java.util.List;

//杨辉三角
public class Practice66 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();//设置列

        for(int i = 0;i<numRows;i++){
            List<Integer> Row =new ArrayList<>();
            //设置当前ROW行的数据
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    Row.add(1);//用add不用set:set容量有限制，会发生越界
                }else{
                    Row.add(0);
                }
                ret.add(Row);
            }
        }
        //设置其他位置数据
        for(int i =2; i < numRows;i++){
            List<Integer> cur=ret.get(i);//当前位置
            List<Integer> pre=ret.get(i-1);//当前位置的上一行
            for(int j =1;j<i;j++){
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
        return ret;
    }

}
