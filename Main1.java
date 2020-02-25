import java.util.Scanner;
//十六进制转二进制
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = input.next();
        }
        input.close();
        for (int i = 0; i < n; i++) {
            String aa = SixteenTransfromTwo(strings[i]);
            if (aa.length() % 3 == 1) {
                aa = "00" + aa;
            }
            if (aa.length() % 3 == 2) {
                aa = "0" + aa;
            }
            String aaa = BinarytoOcal(aa);
            System.out.println(aaa);
        }
    }


    //十六进制转二进制
    public static String SixteenTransfromTwo(String str){
        StringBuffer a = new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            switch(str.charAt(i)){
                case '0' :
                    a.append("0000");
                    break;
                case '1':
                    a.append("0001");
                    break;
                case '2' :
                    a.append("0010");
                    break;
                case '3' :
                    a.append("0011");
                    break;
                case '4' :
                    a.append("0100");
                    break;
                case '5' :
                    a.append("0101");
                    break;
                case '6' :
                    a.append("0110");
                    break;
                case '7' :
                    a.append("0111");
                    break;
                case '8' :
                    a.append("1000");
                    break;
                case '9' :
                    a.append("1001");
                    break;
                case 'A' :
                    a.append("1010");
                    break;
                case 'B' :
                    a.append("1011");
                    break;
                case 'C' :
                    a.append("1100");
                    break;
                case 'D' :
                    a.append("1101");
                    break;
                case 'E' :
                    a.append("1110");
                    break;
                case 'F' :
                    a.append("1111");
                    break;
                default:
                    break;
            }
        }
        return a.toString();
    }
    public static String BinarytoOcal(String b) {
        int k;
        if(b.substring(0,3).equals("000")){
            k=3;                   //如果前面三个是000的话，则不让输出0
        } else{
            k=0;
        }
        StringBuffer bb = new StringBuffer();
        for(int i=k;i<b.length()-2;i=i+3) {
            switch(b.substring(i,i+3)) {
                case "000":
                    bb.append('0');break;
                case "001":
                    bb.append('1');break;
                case "010":
                    bb.append('2');break;
                case "011":
                    bb.append('3');break;
                case "100":
                    bb.append('4');break;
                case "101":
                    bb.append('5');break;
                case "110":
                    bb.append('6');break;
                case "111":
                    bb.append('7');break;
                default:break;
            }
        }
        return bb.toString();

    }
}
 /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strings = new String[11];
        for (int i = 0; i < strings.length; i++) {
            String str = input.next();
            String b = Integer.toBinaryString(Integer.valueOf(str, 16));
            //将16进制转化成2进制   Integer.valueOf(str,16)=> 使用16进制
            String c = Integer.toOctalString(Integer.valueOf(b, 2));
            //将2进制转化成8进制    Integer.valueOf(b,2) =>使用2进制
            strings[i] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }*/










