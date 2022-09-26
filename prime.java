import java.util.*;
class prime{
    public void prime_range(int n, int i){
        int count=0;
        for (int j = 1; j <= n; j++) {
            if(i%j==0)
              count++;
        }
        if(count==2)
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        prime obj=new prime();
        for (int i = 1; i <=n ; i++) {
             obj.prime_range(n, i); 
        }
    }
}