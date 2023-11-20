// program showing the concept of Thread

class Demo6 extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("\t"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        Demo6 obj1 = new Demo6();
        
        obj.start();
            try{
                //obj.join();
                obj.join(5000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        obj1.start();
    }   
}
