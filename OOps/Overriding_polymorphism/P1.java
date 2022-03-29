import java.util.*;
class Fruit{
    String name,taste;
    void eat(String name,String taste){
        this.name=name;
        this.taste=taste;
        System.out.println("Name : "+this.name);
        System.out.println("Taste : "+this.taste);
    }
}
class Apple extends Fruit{{
    name="Apple";
    taste="Sweet";}
    void eat(){
        System.out.println("Name : "+this.name);
        System.out.println("Taste : "+this.taste);
    }
}
class Orange extends Fruit{
    {name="Orange";
    taste="Sweet-tart";
}
    void eat(){
        System.out.println("Name : "+this.name);
        System.out.println("Taste : "+this.taste);
    }
}
public class P1{
    public static void main(String[] args){
        Apple a=new Apple();
        a.eat();
        System.out.println("\n");
        a.eat("Grapes","Tart");
        System.out.println("\n");
        Orange o=new Orange();
        o.eat();

    }
}
