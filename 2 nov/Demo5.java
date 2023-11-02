// program showing the concept of final keyword

class Demo5{
    final int a;
    {
        a=22;
        System.out.println("Initializer block executes");
    }
    Demo5(){
        System.out.println("value of a : "+a);
    }
    public static void main(String args[]){
      new Demo5();
      new Demo5();
    }
}