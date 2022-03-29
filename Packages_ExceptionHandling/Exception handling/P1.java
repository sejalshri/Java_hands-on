import java.util.*;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter input :");
            int t=Integer.parseInt(sc.next());
            System.out.println("Square of "+t+" = "+t*t);
        }
        catch (NumberFormatException e){
            System.out.println("input is not a valid format for an integer");
        }
    }
}
