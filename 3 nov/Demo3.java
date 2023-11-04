// program showing the concept of super keyword

// Parent class
class SuperParent {
        void display(){
        System.out.println("super Parent class display method called");
    }

}
class Parent extends SuperParent{
    String name = "Andrew Anderson";
    Parent(){
        System.out.println("Parent class constructor called");
    }
}
// Child class
class Child extends Parent{
    String name = "Jackson Jack";
    Child(){
        super();
        System.out.println("Child class constructor called");
    }
    void display(){
        System.out.println("Child class display method called");
    }
    void show(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
        
        super.display();
        display();
    }
}

class Demo3{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.show();
    }
}