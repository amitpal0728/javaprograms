// program showing the concept of Thread

class Demo1 extends Thread{
    public static void main(String args[]){
        System.out.println("Current Thread : "+Thread.currentThread());
        System.out.println("Current Thread Name : "+Thread.currentThread().getName()); 
        System.out.println("Current Thread Id : "+Thread.currentThread().getId()); 
        System.out.println("Current Thread Priority : "+Thread.currentThread().getPriority()); 
    }   
}