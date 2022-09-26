import java.util.Scanner;

public class num_palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=num;
        int rev=0;
        while (a>0) {
            int rem=a%10;
            a/=10;
            rev=rev*10 +rem;
        }
        System.out.println(rev);
        if(num==rev)
          System.out.println("palindrome");
        else
          System.out.println("not palindrome");
    }
}
