public class P5 {
    public static void main(String[] args){
        char c1='z';
        int c11=c1;
        System.out.println(c11);
        if((c11>=65 && c11<=90)||(c11>=97 && c11<=122)){
            System.out.println("Alphabet");
        }
        else if(c11>=49 && c11<=57){
            System.out.println("Number");
        }
        else{
            System.out.println("Special character");
        }
    }
}
