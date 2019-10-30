public class Practice6 {
    public static void main(String[] args) {
        int a=25;
        int b=30;
        int c=0;
        while(a%b!=0)
        {
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
