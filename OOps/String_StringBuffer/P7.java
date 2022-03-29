 public class P7{
     static void remove(String s){
         String s3="";
         for(int i=0;i<s.length();i++){
             if(i==0 || i==s.length()-1){
                 if(s.charAt(i)!='x'){
                     s3+=s.charAt(i);
                 }
             }
             else{
                 s3+=s.charAt(i);
             }
         }
         System.out.println(s3);
     }
     public static void main(String[] args){
         String s1="hxi";
         String s2="xhih1h1h1x";
         remove(s1);
         remove(s2);
     }
}
