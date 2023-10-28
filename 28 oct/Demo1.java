// program showing the concept of methods

class Demo1{
    // user defined function
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        // creation of object
        Demo1 obj = new Demo1();

        // calling of method
        obj.display();
    }
}