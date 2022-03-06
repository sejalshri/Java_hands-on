import java.util.*;
public class P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        if(n>=1){
            System.out.println("n is Positive Number");
        }
        else if(n<=-1){
            System.out.println("n is Negative Number");
        }
        else{
            System.out.println("n is Zero");
        }
        sc.close();
    }
}
