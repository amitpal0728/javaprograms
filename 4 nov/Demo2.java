// program showing the concept of method overriding | run time polymorphism

class Parent{
    String name="Andrew Anderson";
    void display(){
        System.out.println("display of parent method called");
    }
    void draw(){
        System.out.println("draw of parent method called");
    }
}
class Child extends Parent{
    String name="Mathew Math";
    void display(){
        System.out.println("display of child method called");
    }    
    void view(){
        System.out.println("view of child method called");
    }
}
class Demo2{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
        obj.draw();
        System.out.println("Parent name : "+obj.name);

        Child cobj = (Child)obj;// downcasting
        cobj.view();
        System.out.println("Child name : "+cobj.name);
    }
}