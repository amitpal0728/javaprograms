// program showing the concept of parameterized constructor

import java.util.Scanner;
class Student{
    int sid;
    double per;
    String name;
    Student(){
        System.out.println("default constructor called");
    } 
    Student(int sid,double per){
        this.sid=sid;
        this.per=per;
    }

    void display(){
        System.out.println("Student Details : \nStudent Id : "+sid);
        System.out.println("Student Percentage : "+per);
        System.out.println("Student Name : "+name);
    }
}
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id : ");
        int sid = sc.nextInt();

        System.out.println("Enter student percentage : ");
        double per = sc.nextDouble();

        // parameterized constructor
        Student obj = new Student();
        Student sobj = new Student(sid,per);
        sobj.display();
    }
}
