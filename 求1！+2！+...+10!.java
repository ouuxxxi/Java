//求1！+2！+...+10!
public class Practice12 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int sum=0;int sum1 =0;
        for(i = 0;i<=10;i++){
            sum=1;
            for(j=1;j<=i;j++){
                sum*=j;
            }
            sum1+=sum;
        }
        System.out.println(sum1);
    }
}
