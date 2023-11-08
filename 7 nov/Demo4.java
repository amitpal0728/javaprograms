interface Showable{
    int age=100;
    void getAge();
}

class GetAge implements Showable{
    @Override
    public void getAge(){
        System.out.println("Age : "+age);
    }
}

class Demo4{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.getAge();
    }
}