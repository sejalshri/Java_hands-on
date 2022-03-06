import java.util.*;
public class P17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        while(n!=0){
            int remainder = n % 10;  
            reverse = reverse * 10 + remainder;  
            n = n/10;
        }
        System.out.println(temp+" -> "+reverse);
    }
}
