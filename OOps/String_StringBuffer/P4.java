  public class P4 {
      static void firsthalf(String s){
          String str;
          if(s.length()%2==0){
              str=s.substring(0,s.length()/2);
              System.out.println("First half of "+s+" is "+str);
          }
          else{
              System.out.println("Null");
          }
      }
      public static void main(String[] args){
          String s1="CatDog";
          String s2="Cat";
          firsthalf(s1);
          firsthalf(s2);
      }
  }
