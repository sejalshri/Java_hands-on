import java.util.*;
class Animal{
    void eat(){
        System.out.println("Parent class eat method");
    }
    void sleep(){
        System.out.println("Parent class sleep method");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("Child class eat method");
    }
    void sleep(){
        System.out.println("Child class sleep method");
    }
    void fly(){
        System.out.println("Child class fly method");
    }
}
public class P1{
    public static void main(String[] args){
        Animal A1=new Animal();
        A1.eat();
        A1.sleep();
        Bird B1=new Bird();
        B1.eat();
        B1.sleep();
        B1.fly();
    }
}
