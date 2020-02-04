import java.util.Stack;
//逆波兰表达式求值
public class EvalRPN {
    public static int evalRPN(String[] tokens){
        Stack<Integer> evalStack = new Stack<>();
        for (int i = 0; i <tokens.length ; i++) {
            String str=tokens[i];
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")) {
                int num1 = evalStack.pop();
                int num2 = evalStack.pop();
                switch (str.charAt(0)) {
                    case '+':
                        evalStack.push(num1 + num2);
                        break;
                    case '-':
                        evalStack.push(num1 - num2);
                        break;
                    case '*':
                        evalStack.push(num1 * num2);
                        break;
                    case '/':
                        evalStack.push(num1 / num2);
                        break;
                }
            }else
                {
                    evalStack.push(Integer.parseInt(str));//将字符类型数据转换为Integer整型数据
                }
            }
        return evalStack.pop();
        }


    public static void main(String[] args) {
       String[] tokens= {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));

    }
}
