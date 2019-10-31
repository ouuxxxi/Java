public class Practice7 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        float sum;
        float sum1=0;
        float sum2=0;
        for(i=1;i<=99;i=i+2)
        {
            sum1+=1.0/i;
        }

        for(j=2;j<=100;j=j+2)
        {
            sum2+=1.0/j;
        }
        sum=sum1-sum2;
        System.out.println(sum);
    }
}
