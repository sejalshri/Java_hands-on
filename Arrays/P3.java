import java.util.*;
public class P3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(); 
        int flag=-1; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                flag=i+1;
                break;
            }
        }
        if(flag==-1){
            System.out.println("-1");
        }
        else{
            System.out.println(s+" is at position "+flag);
        }
    }
}
