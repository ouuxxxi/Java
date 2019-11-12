package O;

import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {
public abstract double getArea();
public abstract double getPerimeter();
}

class yuan extends shape{
        private double r;
        public yuan(double ar){
                r=ar;
        }
        public double getArea(){
                return Math.PI*r*r;
        }
        public double getPerimeter(){
                return 2*Math.PI*r;
        }
}

class juxing extends shape{
        private double w;
        private double h;
        public juxing(double aw, double ah){
                w=aw;
                h=ah;
        }
        public double getArea(){
                return w*h;
        }
        public double getPerimeter(){
                return 2*(w+h);
        }
}

public class Main {
        public static double sumArea(shape[] a){
                double sum=0;
                for(int i=0;i<a.length;i++){
                        sum+=a[i].getArea();
                }
                return sum;
        }
        public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               DecimalFormat decimalFormat= new DecimalFormat("#.####");
               shape[] a=new shape[4];
               double r=in.nextDouble();
               a[0]=new yuan(r);
               r=in.nextDouble();
               a[1]=new yuan(r);

               double w=in.nextDouble();
               double h=in.nextDouble();
               a[2]=new juxing(w,h);
               w=in.nextDouble();
               h=in.nextDouble();
               a[3]=new juxing(w,h);

               in.close();
               System.out.println("The total area is "+decimalFormat.format(sumArea(a)));
    }
}

