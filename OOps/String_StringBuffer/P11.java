 public class P11{
     public static void main(String[] args){
         String s1="wipro";
         int n=3;
         int t=s1.length()-n;
         s1=s1.substring(t);
         String s3="";
         for(int i=0;i<n;i++){
             s3+=s1;
         }   
         System.out.println(s3);
     }
};

