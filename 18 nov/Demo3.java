// program showing the concept of Thread

class Demo3 extends Thread{
    @Override
    public void run(){
        System.out.println("Current Thread Name : "+Thread.currentThread().getName()); 
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        Demo3 obj1 = new Demo3();
        Demo3 obj2 = new Demo3();
        obj.start();
        obj1.start();
        obj2.start();
    }   
}
