// program showing the concept of Thread

class ThreadDemo1 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=19;i++){
            if(i%5!=0)    
                System.out.println(i);
            else
                System.out.println(++i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
}
class ThreadDemo2 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(4000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
            System.out.println("Welcome");
        }
    }
}
class Demo1{
    public static void main(String args[])
    {
        Thread th1 = new Thread(new ThreadDemo1());
         th1.start();
        Thread th2 = new Thread(new ThreadDemo2());
        th2.start();       
    }
}