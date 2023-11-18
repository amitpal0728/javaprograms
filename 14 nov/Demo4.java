// program showing the concept of Exception Handling

class Demo4{
    String str;
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        try{
            System.out.println("Length : "+obj.str.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
    }
}