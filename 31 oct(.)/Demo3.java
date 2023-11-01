// program showing the concept of method overloading

class Demo3{
    Demo3(){
        System.out.println("default constructor called");
    }
    public static void main(String args[]){
        new Demo3();
        Demo3 obj1 = new Demo3(),obj2 = new Demo3();
        Demo3 obj3 = obj1;
    }   
}
