// program showing the concept of interface

interface Showable{
    void display();
}
interface Drawable extends Showable{
    void display();
    void show();
}

class Demo2 implements Drawable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Drawable obj1;
            obj1 = new Demo2();
            obj1.display();
            obj1.show();
    }
}