// program showing the concept of Thread

class Demo5 extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("\t"+i);
            // try{
            //     Thread.sleep(1000);
            // }catch(InterruptedException e){
            //     System.out.println("Exception : "+e);
            // }
        }
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        Demo5 obj1 = new Demo5();
        
        obj.start();
            try{
                Thread.sleep(4000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }

        obj1.start();
    }   
}
