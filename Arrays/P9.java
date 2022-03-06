import java.util.*;
public class P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is "+Arrays.toString(arr));
        int six=-1,seven=-1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==6){
                six=i;
            }
            if(arr[i]==7){
                seven=i;
            }
        }
        int sum1=0;
        if(six>0 && seven>0 && six<seven){
            for(int i=six;i<=seven;i++){
                sum1+=arr[i];
            }
        }
        sum=sum-sum1;
        System.out.println("Sum = "+ sum);
    }
}
