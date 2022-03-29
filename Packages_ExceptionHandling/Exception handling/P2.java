import java.util.*;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("Enter the index of the array element you want to access :");
            int t=sc.nextInt();
            System.out.println("element at index "+t+arr[t]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
