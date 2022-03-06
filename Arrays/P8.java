import java.util.*;
public class P8 {
    public static void main(String[] args) {
        int arr[]={65,120,100,45,34,23,90,120,120,100,100,100};
        Arrays.sort(arr);
        int count=1;
        int ans=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    ans=arr[i-1];
                }
                count=1;
            }
        }
        System.out.println("Element that has occurred highest number of times is: "+ ans);   
    } 
}
