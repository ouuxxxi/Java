//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
// 判断数组中是否含有该整数。
public class Practice33 {
    public static  boolean Find(int k, int [][] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(k==arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8}
        };
       boolean flag=Find(2,arr);
       System.out.println(flag);
    }

}
