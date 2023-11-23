// program showing the concept of Thread Synchronization

class First {
    /* shared resources */
    synchronized void display(String name){
        System.out.print(" [ ");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");
    }
}
class Second extends Thread{ 
    First fobj;
    String name;
    Second(First fobj,String name){
        this.fobj=fobj;
        this.name=name;
        start();
    }
    @Override
    public void run(){
            fobj.display(name);       
    }
}

class Demo2{
    public static void main(String args[]){
        First obj = new First();
        Second s1 = new Second(obj,"Andrew");
        Second s2 = new Second(obj,"Mathew");
        Second s3 = new Second(obj,"Jackson");
    }
}