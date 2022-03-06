import java.util.*;
public class P10 {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        int temp=0;
        if(args.length!=4){
              System.out.println("Invalid args: Expected args length is 4");
        }
        else{
              System.out.println("Given array : ");
              for(int i=0;i<2;i++){
                  for(int j=0;j<2;j++){
                      arr[i][j]=Integer.parseInt(args[temp]);
                      System.out.print(arr[i][j]+" ");
                      temp++;
                  }
                  System.out.print("\n");
              }
              temp=arr[0][0];
              arr[0][0]=arr[1][1];
              arr[1][1]=temp;

              temp=arr[0][1];
              arr[0][1]=arr[1][0];
              arr[1][0]=temp;
              System.out.println("Reversed array : ");
              for(int i=0;i<2;i++){
                  for(int j=0;j<2;j++){
                  System.out.print(arr[i][j]+" ");
                  }
                  System.out.print("\n");
              }
          }
    }
}
