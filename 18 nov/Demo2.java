// program showing the concept of Thread

class Demo2 extends Thread{
    @Override
    public void run(){
        System.out.println("Current Thread : "+Thread.currentThread());
        System.out.println("Current Thread Name : "+Thread.currentThread().getName()); 
        System.out.println("Current Thread Id : "+Thread.currentThread().getId()); 
        System.out.println("Current Thread Priority : "+Thread.currentThread().getPriority()); 
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.start();
    }   
}
