public class Practice2 {
    public static void main(String[] args) {
        int n=11 ;
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("该数不是素数");
            }
            else if(i==n)
            {
                System.out.println("该数是素数");
            }

        }
    }
}
