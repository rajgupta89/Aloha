import java.util.*;

public class prime_range {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        for (int i = 2; count < n; i++)
        {

            boolean isPrime = true;
            for (int j=2; j <= i/2; j++)
            {
                if ( i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
            {
                System.out.print(i+" ");
                count++;
            }
        }
    }
}