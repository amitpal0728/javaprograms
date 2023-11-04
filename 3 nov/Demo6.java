// program showing the concept of hierarchical inheritance

class Parent{
    void display(){
        System.out.println("display method called");
    }
}
class Child1 extends Parent{
    void show(){
        System.out.println("show method called");
        display();
    }
}
class Child2 extends Parent{
    void view(){
        System.out.println("view method called");
        display();
    }
}

class Demo6{
    public static void main(String args[]){
        Child1 obj1 = new Child1();
        obj1.show();

        Child2 obj2 = new Child2();
        obj2.view();
    }
}