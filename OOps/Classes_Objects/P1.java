import java.util.*;
class Box{
    double length,breadth,height;
    void dimensions(double l,double b,double h){
        length=l;
        breadth=b;
        height=h;
    }
    double volume(){
        return length*breadth*height;
    }
};
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the box");
        double l=sc.nextDouble();
        System.out.println("Enter breadth of the box");
        double b=sc.nextDouble();
        System.out.println("Enter height of the box");
        double h=sc.nextDouble();
        Box obj=new Box();
        obj.dimensions(l,b,h);
        double volume=obj.volume();
        System.out.println("Volume of the box = "+volume);
    }
}
