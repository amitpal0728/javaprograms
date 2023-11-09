// program showing the concept of interface in java 8
interface Showable{
    default void show(){
        System.out.println("show method called");
    }
}
interface Drawable{
    default void show(){
        System.out.println("show method called");
    }
}

class Demo9 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called..!!");
    }
    public static void main(String args[]){
        Showable obj = new Demo9();
        obj.show();

        Drawable obj1 = new Demo9();
        obj1.show();
    }
}