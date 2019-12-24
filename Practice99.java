//青蛙跳台阶
public class Practice99 {
        public static int JumpFloor(int n) {
            if(n==1){
                return 1;
            }else if(n==2){
                return 2;
            }else if(n<1){
                return 0;
            }
            return JumpFloor(n-1)+JumpFloor(n-2);
        }

    public static void main(String[] args) {
        int p=JumpFloor(4);
        System.out.println(p);
     }
    }

