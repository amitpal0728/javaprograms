// program showing the concept of interface

interface Showable{
    int a=100;
}
interface Drawable{
    int a=200;
}

class Demo3 implements Showable,Drawable{
    public static void main(String args[]){
        System.out.println("a : "+Showable.a);
        System.out.println("a : "+Drawable.a);
    }
}