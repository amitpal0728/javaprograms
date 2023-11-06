//program showing the concept of getter and setter method and the concept of encapsulation

class Student{
    int rno;
    double per;
    String name;

    /* setter methods */
    void setRno(int rno){
        this.rno=rno;
    }
    void setPer(double per){
            this.per=per;
        }
    void setName(String name){
            this.name=name;
        }

    /* getter method */
    int getRno(){
        return rno;
    }
    double getPer(){
        return per;
    }
    String getName(){
        return name;
    }
}

class Demo3{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setRno(1000);
        obj.setPer(45.56);
        obj.setName("Andrew Anderson");

        System.out.println("Name : "+obj.getName());
        System.out.println("Percentage : "+obj.getPer());
        System.out.println("Roll Number : "+obj.getRno());
    }
}