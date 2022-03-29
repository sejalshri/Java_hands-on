 public class P2{
     public static void main(String[] args){
         String s1="Mark";
         String s2="kate";
         String s3;
         if(s1.charAt(s1.length()-1)==s2.charAt(0)){
             s3=s1+s2.substring(1);
         }
         else{
             s3=s1+s2;
         }
         System.out.println(s1+" + "+s2+" = "+s3.toLowerCase());
     }
 }