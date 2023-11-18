class Demo5 {
    public static void main(String[] args) {
        int c[]= {1,2,3,4,5};
        String str = "Andrew";
        try{
            System.out.println(c[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
        try{
            System.out.println(str.charAt(10));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }

    }
}