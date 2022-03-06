import java.util.*;
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("n is Even Number");
        }
        else{
            System.out.println("n is Odd Number");
        }
    }
}
