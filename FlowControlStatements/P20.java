import java.util.*;
public class P20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu : 1- Add ");
        System.out.println("2- Subtract");
        System.out.println("Enter your choice: (1 or 2)");
        int c=sc.nextInt();
        System.out.println("Enter two integers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        switch(c){
            case 1: System.out.println(n1+n2);
            break;
            case 2: System.out.println(n1-n2);
            break;
            default:System.out.println("Not a valid choice");
        }
    }
}
