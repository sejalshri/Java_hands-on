import java.util.*;
class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
public class P2{
    public static void main(String[] args){
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.draw();
        c.erase();
        System.out.println("\n");
        t.draw();
        t.erase();
        System.out.println("\n");
        s.draw();
        s.erase();
    }
}
