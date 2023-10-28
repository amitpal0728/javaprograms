// program showing the concept of methods

import java.util.Scanner;
class Demo3{
    // instance variables
    int a,b;
    void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("\na : "+a+"\nb : "+b);
    }
    void swap(){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Demo3 obj = new Demo3();
        obj.setData(a,b);

        System.out.println("Before swapping : ");
        obj.display();
            obj.swap();
        System.out.println("\nAfter swapping : ");
        obj.display();
    }
}