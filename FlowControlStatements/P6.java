public class P6 {
    public static void main(String[] args){
        String interest;
        int age=Integer.parseInt(args[1]);
        if(args[0]=="Male"){
            if(age>=1 && age<=60){
                interest="9.2%";
            }
            else{
                interest="8.3%";
            }
        }
        else{
            if(age>=1 && age<=58){
                interest="8.2%";
            }
            else{
                interest="7.6%";
            }
        }
        System.out.println("Interest = "+interest);
    }
}
