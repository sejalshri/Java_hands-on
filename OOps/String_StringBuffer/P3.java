 public class P3{
     static void change(String s){
         String str;
         if(s.length()<2){
             str=s.substring(0);
         }
         else{
             str=s.substring(0,2);
         }
         String s3="";
         for(int i=0;i<s.length();i++){
             s3+=str;
         }
         System.out.println(s+" = "+s3);
     }
     public static void main(String[] args){
         String s1="M";
         String s2="Wipro";
         change(s1);
         change(s2);
     }
 }
