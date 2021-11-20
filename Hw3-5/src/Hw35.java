
import java.util.Scanner;


public class Hw35 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        System.out.println("valid parentheses  " + BB(s));
        
    }

    public static int BB(String s) throws Exception {

        int k = 0;
       


        Stack b = new Stack(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                b.push(s.charAt(i));
            }

            if(!b.isEmpty() && s.charAt(i) == ')' && (char)b.pop() == '('){
                    k++;
            }
        }

        return k;
    }

}
