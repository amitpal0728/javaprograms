// program showing the concept of interface in java 8
interface Showable{
    default void show(){
        System.out.println("show method called");
    }
    static void display(){
        System.out.println("display method called");
    }
}

class Demo8 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo8();
        obj.show();
        Showable.display();
    }
}