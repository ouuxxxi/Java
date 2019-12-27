//变态青蛙跳台阶
public class Practice110 {
        public static int JumpFloorII(int n) {
            if(n==1){
                return 1;
            }else if(n==2){
                return 2;
            }else if(n<1){
                return 0;
            }
            return 2*JumpFloorII(n-1);
        }

    public static void main(String[] args) {
        int p=JumpFloorII(5);
        System.out.println(p);
    }
    }

