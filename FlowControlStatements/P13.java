public class P13 {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for(int i=10;i<=99;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
