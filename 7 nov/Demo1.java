// program showing the concept of interface

interface Showable{
    void display();
}
interface Drawable{
    void display();
    void show();
}

class Demo1 implements Showable,Drawable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Showable obj1;
        Drawable obj2;
            obj1 = new Demo1();
            obj1.display();

            obj2 = new Demo1();
            obj2.display();
            obj2.show();
    }
}