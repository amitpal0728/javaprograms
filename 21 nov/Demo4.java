// program showing the concept of InterThread Communication
class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withDraw(int wamt){
        if(wamt>bal){
            System.out.println("Low Balance");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
            System.out.println("Balance : "+bal);
            System.out.println("WithDrawal Amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }else{
            System.out.println("Balance : "+bal);
            System.out.println("WithDrawal Amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }
    }
    synchronized void deposit(int damt){
            System.out.println("Going to deposit");
            bal+=damt;
            System.out.println("Amount deposited");
            notify();
    }
}

class Demo4{
    public static void main(String args[]){
        int bal = 1000;
        Customer cobj = new Customer(bal);
        new Thread(){
            @Override
            public void run(){
                cobj.withDraw(1200);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                cobj.deposit(1200);
            }
        }.start();
    }
}