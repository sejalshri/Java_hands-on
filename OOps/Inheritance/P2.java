import java.util.*;
class Person{
    String name;
}
class Student extends Person{
    int age;
}
class Teacher extends Person{
    int salary;
    String subject;
    void assign(int salary,String subject,String name){
        this.salary=salary;
        this.subject=subject;
        this.name=name;
    }
    void display(){
        System.out.println("Teacher's Name : "+name);
        System.out.println("Teacher's Salary : "+salary);
        System.out.println("subject : "+subject);
    }
}
class CollegeStudent extends Student{
    int year;
    String major;
    void assign(int year,String major,int age,String name){
        this.year=year;
        this.major=major;
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println("Student Name : "+name);
        System.out.println("Student age : "+age);
        System.out.println("year : "+year );
        System.out.println("major : "+major);
    }
}

public class P2{
    public static void main(String[] args){
        CollegeStudent cs=new CollegeStudent();
        cs.assign(2,"Computer Science",19,"Sejal Srivastava");
        cs.display();
        Teacher t=new Teacher();
        t.assign(500000,"CSE","Ms.Sumedha Panwar");
        t.display();
    }
}
