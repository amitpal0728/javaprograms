// program showing the concept of abstract class

abstract class Parent{
    abstract void display();
}

class Circle extends Parent{
    void display(){
        System.out.println("display method of circle called");
    }
}

class Rectangle extends Parent{
    void display(){
        System.out.println("display method of rectangle called");
    }
}

class Demo1{
    public static void main(String args[]){
        Parent pobj;
            pobj = new Circle();
            pobj.display();
            pobj = new Rectangle();
            pobj.display();
    }
}
