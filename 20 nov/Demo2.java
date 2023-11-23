// program showing the concept of Thread

class Demo2{
    public static void main(String args[])
    {
     /* 
     Runnable obj = new Runnable(){
        @Override
        public void run(){
            System.out.println("run method executes");
        } 
     };      
     Thread th = new Thread(obj); 
     th.start();
     */
     
     /*  
     new Thread(new Runnable(){
        @Override
        public void run(){
            System.out.println("run method executes");
        } 
     }).start();
     */

     /* 
     Thread obj = new Thread(){
        @Override
        public void run(){
            System.out.println("run method executes");
        }
     };
     obj.start();
     */
/* 
     new Thread(){
        @Override
        public void run(){
            System.out.println("run method executes");
        }
     }.start();
*/

/*
      Runnable obj = ()->System.out.println("run method executes");
     Thread th = new Thread(obj); 
     th.start();
*/

     new Thread(()->System.out.println("run method executes")).start();

    }
}