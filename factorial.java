import java.util.*;

public class factorial {
    public static void fac(int n){
        long fact=1;
        for (int i = 1; i <=n; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fac(n);
    }
}
