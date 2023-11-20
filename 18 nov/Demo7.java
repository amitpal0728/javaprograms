// program showing the concept of Thread


class Demo7 implements Runnable{
    @Override
    public void run(){
        System.out.println("run method executes");
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        Thread th = new Thread(obj);
        th.start();
    }   
}
