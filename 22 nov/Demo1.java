// program showing the concept of strings

class Demo1{
    public static void main(String args[]){
        // string created by string literal
        String name = "Andrew";
        System.out.println("String : "+name);

        // string created by new keyword
        String name1 = new String(name);
        System.out.println("String : "+name1);

        // string created by character array
        char nm[] = {'H','e','l','l','o'};
        String name2 = new String(nm);
        System.out.println("String : "+name2);

        byte bt[] = {65,66,67,68,69};
        String name3 = new String(bt);
        System.out.println("String : "+name3);

    }
}