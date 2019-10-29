public class Practice3 {
    public static void main(String[] args) {
        int i =0;
        for(i=100;i<=200;i++)
        {
            int j=0;
            for(j=2;j<=i;j++)
                if (i % j == 0) {
                    break;
                }
                else if (j >= i) {
                    System.out.println(i);
                }
        }
    }
}
