// program showing the concept of Thread



class Demo8 implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            if (i%5!=0)
            System.out.println(i);
            else
            System.out.println("Hello");
        }
    }
    public static void main(String args[]){

        Demo8 obj = new Demo8();

        Thread th = new Thread(obj);
        th.start();
    }   
}
