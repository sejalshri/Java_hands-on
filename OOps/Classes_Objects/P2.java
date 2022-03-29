import java.util.*;
class Patient{
    String name;
    double height,weight,bmi;
    Patient(String s){
        name=s;
    }
    void details(double h,double w){
        height=h;
        weight=w;
    }
    double bmi(){
        bmi=(weight/(height*height))*703;
        return bmi;
    }
}
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Patient obj=new Patient("Sejal");
        System.out.println("Enter height of "+obj.name);
        double h=sc.nextDouble();
        System.out.println("Enter weight of "+obj.name);
        double w=sc.nextDouble();
        obj.details(h,w);
        double bmi=obj.bmi();
        System.out.println("BMI VALUE = "+bmi);
    }
}
