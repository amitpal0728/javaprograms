class Demo8 {
    public static void main(String[] args) {
        try{
            Class.forName("Demo99");
            System.out.println("Class Found");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
    }
}