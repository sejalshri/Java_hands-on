import java.util.*;
public class P11 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int temp=0;
        if(args.length!=9){
              System.out.println("Invalid args: Expected args length is 9");
        }
        else{
              System.out.println("Given array : ");
              int max=Integer.MIN_VALUE;
              for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                      arr[i][j]=Integer.parseInt(args[temp]);
                      if(arr[i][j]>max){
                          max=arr[i][j];
                      }
                      System.out.print(arr[i][j]+" ");
                      temp++;
                  }
                  System.out.print("\n");
              }
              System.out.println("Biggest number in a given array is " + max);
          }
    }
}
