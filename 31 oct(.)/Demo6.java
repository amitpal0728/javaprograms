// program showing the concept of constructor chaining

class Demo6{
    int rno;
    double per;
    String name;
    Demo6(){
        this(101);
    }
    Demo6(int rno){
        this(rno,56.67);
    }
    Demo6(int rno,double per){
        this(rno,per,"Andrew Anderson");
    }
    Demo6(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        display();
    }
    void display(){
        System.out.println("Roll number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        new Demo6();
    }   
}