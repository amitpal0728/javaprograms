// program showing the concept of final keyword

class Demo4{
    int a,c;
    static int b;
    {
        a = 55;
        b=54;
        System.out.println("Initializer block executes c : "+c);
    }
    Demo4(){
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
    public static void main(String args[]){
      new Demo4();
    }
}