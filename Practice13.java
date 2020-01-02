//1、2、3、4能组成多少个互不相同且无重复的数字？分别是多少？
public class Practice13 {
    public static void main(String[] args) {
       int count=0;
        for(int i =1;i<5;i++){
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k <5 ; k++) {
                    if(i!=j && i!=k && j!=k){
                        count++;
                    }
                    System.out.println(100*i+10*j+k);
                }
            }
        }
        System.out.println("共有"+count);
    }
}
