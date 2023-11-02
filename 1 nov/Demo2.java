// program showing the concept of parameterized constructor

import java.util.Scanner;
class Student{
    int sid;
    double per;
    Student(){}
    Student(int sid,double per){
        this.sid=sid;
        this.per=per;
    }
    void display(){
        System.out.println("Student Details : \nStudent Id : "+sid);
        System.out.println("Student Percentage : "+per);
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id : ");
        int sid = sc.nextInt();

        System.out.println("Enter student percentage : ");
        double per = sc.nextDouble();

        // parameterized constructor
        Student obj1 = new Student(sid,per);
        Student obj2 = new Student();

            obj2.sid = obj1.sid;
            obj2.per = obj1.per;    

        obj1.display();
        obj2.display();
    }
}

/*
    shallow copy
    -------------
    obj1                             obj2
    |                                 |
    |--rno--------102------------rno--|
    |--name-------andrew---------name-|
    |--per--------78.89----------per--|


    deep copy
    -------------
    obj1                                         obj2
    |                                              |
    |--rno--------103          102------------rno--|
    |--name-------andrew       andrew---------name-|
    |--per--------78.89        78.89----------per--|


*/


