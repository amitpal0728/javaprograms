// program showing the concept of methods

import java.util.Scanner;
class Demo6{
    void display(Demo6 obj){
        System.out.println("display method called : "+obj);
        // here if we print obj then it will gives you default string representation of object
    }
    void show(){
        System.out.println("Show method called");
        // here this simply represents current object
        display(this);   // this.display(this);
        // here we can also pass this as an argument inside method call
    }
    public static void main(String args[]){
        // Demo6 obj = new Demo6();
        // obj.show();

        // calling of show method by anonymous object
        new Demo6().show();

    }
}

