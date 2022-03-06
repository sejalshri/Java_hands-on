import java.util.*;
public class P5 {
    public static void main(String[] args) {
        int arr[]={65,90,120,100};
        Arrays.sort(arr);
        System.out.println("Smallest element = "+arr[0]);
        System.out.println("2nd Smallest element = "+arr[1]);
        System.out.println("Largest element = "+arr[arr.length-1]);
        System.out.println("2nd Largest element = "+arr[arr.length-2]);
    }
}
