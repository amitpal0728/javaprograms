// program showing the concept of inheritance

// Parent class
class Parent{
    void display(){
        System.out.println("display method called");
    }
}
// Child class
class Child extends Parent{
    void show(){
        System.out.println("show method called");
    }
}

class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
        cobj.show();
    }
}