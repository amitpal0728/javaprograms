// program showing the concept of Deadlock
class Pen{}
class Paper{}
class Demo5{
    public static void main(String args[]){
        Pen pn = new Pen();
        Paper pr = new Paper();

        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread1 uses pen and needs paper");
                    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}    
                    synchronized(pr){
                    System.out.println("Thread1 uses paper and needs pen");
                }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread2 uses paper and needs pen");
                   try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}    
                    synchronized(pn){
                    System.out.println("Thread2 uses pen and needs paper");
                }
                }
            }
        }.start();

    }
}