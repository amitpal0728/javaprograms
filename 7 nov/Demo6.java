interface Showable{
    int age=100;
    void getAge();
}

class Demo6{
    public static void main(String args[]){
        // creating anonymous class
        new Showable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
    }
}