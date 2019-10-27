class Swap{
    private int num1;
    private int num2;

    public Swap(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void func(){
        int temp;
        temp=this.num1;
        this. num1=this.num2;
        this.num2= temp;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}


public class Test3 {
    public static void main(String[] args) {
        Swap a = new Swap(15,20);
        a.func();
    }
}
