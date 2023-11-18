class Demo7 {
    public static void main(String[] args) {
        Object obj = 100;
        try{
            String str = (String)obj;
        }catch(ClassCastException e){
            System.out.println("Exception : "+e);
        }
    }
}