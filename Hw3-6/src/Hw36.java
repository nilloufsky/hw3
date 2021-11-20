
import java.util.Scanner;


public class Hw36 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        
        System.out.println("parentheses we need :" + NB(s));
    }

    public static int NB(String s) throws Exception {

        Stack nb = new Stack(s.length());
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                nb.push(s.charAt(i));
            }
            
            if(!nb.isEmpty() && s.charAt(i) == ')'){
                nb.pop();
            }else if(s.charAt(i) == ')'){
                c++;
            }
        }
        if(!nb.isEmpty()){
            while(!nb.isEmpty()){
                nb.pop();
                c++;
            }
        }
        
        return c;
    }

}
