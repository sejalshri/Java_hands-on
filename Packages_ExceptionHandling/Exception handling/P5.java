import java.util.*;
public class P5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 values :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try{
            int n3=n1/n2;
            System.out.println("The quotient of "+n1+"/"+n2+" = "+n3);
        }
        catch(ArithmeticException e){
            System.out.println("DivideByZeroException caught");
        }
        finally{
            System.out.println("Inside finally block");
        }
    }
}
