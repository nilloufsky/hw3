
import java.util.Scanner;

public class Hw33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input : ");
        String s = input.nextLine();

        StrRev(s);
    }

    public static void StrRev(String s) {

        Stack hs = new Stack();

        String[] str = s.split(" ");

        String str1 = "";
        
        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length(); j++) {
                hs.push(str[i].charAt(j));
            }
            
            while(!hs.isEmpty()){
                str1 += hs.pop();
            }
            
            str1 += " ";

        }
        
        System.out.println("output : ");
        System.out.println(str1);
    }

}
