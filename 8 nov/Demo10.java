// program showing the concept of interface in java 9
interface Showable{
    default void show(){
        printData();
        System.out.println("show method called");
    }
    default void draw(){
        printData();
        System.out.println("draw method called");
    }
    private void printData(){
        System.out.println("\nFirst Statement");
        System.out.println("Second Statement");
    }
}

class Demo10 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo10();
        obj.show();
        obj.draw();
    }
}

/*
        int array_name[] = {1,2,3,4,5};

       datatype array_name[] = new datatype[size];
       int arr[] = new int[5];

        int arr[] = new int[]{1,2,3,4,5};
  

        String args[],name
               args = array
               name=variable

        String []args,name
                args = array
                name = variable
                
         String[] args,name
                 args,name = array       
*/

