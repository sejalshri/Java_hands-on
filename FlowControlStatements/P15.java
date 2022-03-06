import java.util.*;
public class P15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(temp+" -> "+sum);
    }
}
