// program showing the concept of methods

import java.util.Scanner;
class Demo2{
    // instance variables
    int a,b;
    void setData(int a1,int b1){
        a=a1;
        b=b1;
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

        Demo2 obj = new Demo2();
        obj.setData(a,b);

        System.out.println("Before swapping : ");
        obj.display();
            obj.swap();
        System.out.println("\nAfter swapping : ");
        obj.display();
    }
}