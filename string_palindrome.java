import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            s1=s.charAt(i)+s1;
        }
        // System.out.println(s1);
        if(s.equals(s1))
          System.out.println("palindrome");
        else
          System.out.println("not palindrome");
    }
}
