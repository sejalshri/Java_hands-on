import java.util.*;
public class P12 {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=prime(n);
        if(flag==true){
            System.out.println(n+" is a prime number.");
        }
        else{
            System.out.println(n+" is not a prime number.");
        }
    }
}
