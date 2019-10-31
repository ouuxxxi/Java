public class Practice8 {
    public static void main(String[] args) {
        int i=0;
        for(i=1;i<=100;i++) {
            if((i%10==9)^(i/10==9)) {
                System.out.println(i);
            }
        }
    }
}
