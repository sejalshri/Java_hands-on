 public class P10{
     public static void main(String[] args){
         String s1="abc";
         String s2="xyz";
         int min;
         if(s1.length()<s2.length()){
             min=s1.length();
         }
         else{
             min=s2.length();
         }
         String s3="";
         for(int i=0;i<min;i++){
             s3+=s1.charAt(i);
             s3+=s2.charAt(i);
         }
         if(min==s1.length()){
             s3+=s2.substring(min);
         }
         else{
             s3+=s3.substring(min);
         }
         System.out.println(s3);
     }
}
