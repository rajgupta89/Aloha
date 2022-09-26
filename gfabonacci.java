import java.util.Scanner;

public class gfabonacci {
    public static void fab(int n, int a,int b){
        for (int i = 0; i < n-2; i++) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        // int c;
        System.out.print(a+" "+b+" ");
        fab(n, a, b);
    }
}
