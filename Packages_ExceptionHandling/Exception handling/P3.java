import java.util.*;
public class P3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter Number of elements of array :");
            int n=Integer.parseInt(sc.next());
            int[] arr=new int[n];
            System.out.println("Enter array elements :");
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(sc.next());
            }
            System.out.println("Enter the index of the array element you want to access :");
            int t=sc.nextInt();
            System.out.println("element at index "+t+" = "+arr[t]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
