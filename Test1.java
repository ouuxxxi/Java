 class Calculator{
        private int num1;
        private int num2;

        public int add(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
            return num1+num2;
        }

        public int sub(int num1,int num2){
         this.num1=num1;
         this.num2=num2;
         return num1-num2;
     }

     public int mul(int num1,int num2){
         this.num1=num1;
         this.num2=num2;
         return num1*num2;
     }

     public int div(int num1,int num2){
         this.num1=num1;
         this.num2=num2;
         return num1/num2;
     }
    }
    public class Test1 {
    public static void main(String[] args) {
        Calculator calculator = new  Calculator();
        System.out.println(calculator.add(22,30));
        System.out.println(calculator.sub(14,3));
        System.out.println(calculator.mul(22,33));
        System.out.println(calculator.div(99,9));
    }


}
