interface Showable{
    int age=100;
    void getAge();
}

class Demo5{
    public static void main(String args[]){
        // creating anonymous class
        Showable obj = new Showable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        };
        obj.getAge();
    }
}