import java.util.*;
public class P7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int ans;
        if((int)c>=65 && (int)c<=90){
            ans=(int)c+32;
        }
        else{
            ans=(int)c-32;
        }
        System.out.println(c+"  ->  "+(char)ans);
    }
}
