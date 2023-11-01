// program showing the concept of method overloading

class Demo4{
        int rno=101;
        double per;
        String name;

    void display(){
        System.out.println("\ndefault constructor called");
        System.out.println("Roll number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.rno+=100;
        obj.display();
        Demo4 obj1 = new Demo4();
        obj1.display();
    }   
}
