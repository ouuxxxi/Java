import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
            String a = input.next();
            byte[] b = a.getBytes();
            for (int i = 0; i < b.length; i++) {
                if (b[i] == 'a') {
                    System.out.println("a");
                    break;
                }
                 if (b[i] == 'e') {
                    System.out.println("e");
                    break;
                }
               if (b[i] == 'i') {
                    System.out.println("i");
                    break;
                }
                 if (b[i] == 'o') {
                    System.out.println("o");
                    break;
                }
                 if (b[i] == 'u') {
                    System.out.println("u");
                    break;
                }
                else if (b[i] == '\0'){
                    System.out.println("n");
                }

            }
        }
    }


