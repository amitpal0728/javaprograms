// program showing the concept of static block
/* 
class Demo7{
    static String name = "Andrew Anderson";
    static void showData(){
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        showData();
    }
}
*/ 
class DemoEx{
    static String name = "Andrew Anderson";

    static void showData(){
        System.out.println("Name : "+name);
    }
}
class Demo7{  
    public static void main(String args[]){
        DemoEx.showData();
    }
}
