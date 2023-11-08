@FunctionalInterface
interface Showable{
    int age=100;
    void getAge();
}

class Demo7{
    public static void main(String args[]){
        // creating anonymous class
        Showable obj = ()->System.out.println("Age : "+Showable.age);
        obj.getAge();
    }
}