// program showing the concept of Thread

class Demo4 extends Thread{
    @Override
    public void run(){
        System.out.println("Current Thread Name : "+Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority()+"\tisDaemon : "+Thread.currentThread().isDaemon()); 
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();
        obj2.setDaemon(true);
        obj.setName("Andrew");
        obj.setPriority(1);
        obj1.setPriority(2);
        obj2.setPriority(3);
        
        obj.start();
        obj1.start();
        obj2.start();
    }   
}
