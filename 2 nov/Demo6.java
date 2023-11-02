// program showing the concept of static block

/* 
class Demo6{
    static String name = "Andrew Anderson";
    public static void main(String args[]){
        System.out.println("Name : "+name);
        System.out.println("Name : "+Demo6.name);
    }
}
*/
class Demo{
    static String name = "Andrew Anderson";
}
class Demo6{
    public static void main(String args[]){
        System.out.println("Name : "+Demo.name);
    }
}
