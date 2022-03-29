public class P1 {
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("radar");
        if(s.equals(s.reverse())){
            System.out.println(s+" is a palindrome");
        }
        else{
            System.out.println(s+" is not a palindrome");
        }
    }
}
