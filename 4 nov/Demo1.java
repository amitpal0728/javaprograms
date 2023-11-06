// program showing the concept of method overriding

class Parent{
    void display(){
        System.out.println("display of parent method called");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display of child method called");
    }    
}
class Demo1{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}