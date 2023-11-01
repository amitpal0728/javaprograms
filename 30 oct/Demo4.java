// program showing the concept of methods

import java.util.Scanner;
class Demo4{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a=a; // here this is used to represent current class data member
        this.b=b;     
    }
    void add(){
        System.out.println("Add : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Demo4 obj = new Demo4();
        obj.setData(a,b);
        obj.add();
        obj.sub();
        obj.mul();
    }
}