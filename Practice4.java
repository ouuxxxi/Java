public class Practice4 {
    public static void main(String[] args) {
        int year=0;
        for(year=1000;year<=2000;year++) {
            if((year%100!=0 )&& (year%4==0)||(year%400==0))
            {
                System.out.println(year);
            }
        }
    }
}
