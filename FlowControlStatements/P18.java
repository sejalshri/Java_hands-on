import java.util.*;
public class P18 {
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
        if(temp==reverse){
            System.out.println(temp+" is a palindrome.");
        }
        else{
            System.out.println(temp+" is not a palindrome.");
        }
    }
}
