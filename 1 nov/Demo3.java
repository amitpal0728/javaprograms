// program showing the concept of copy constructor (shallow copy)

class Address{
    String state,city;
    Address(String state,String city){
        this.state=state;
        this.city=city;
    }
}
class Person{
    int pid;
    String name;
    Address address;

    Person(int pid,String name,Address address){
        this.pid=pid;
        this.name=name;
        this.address=address;
    }
    Person(Person p){
        pid = p.pid;
        name= p.name;
        address = p.address; 
    }
    void display(){
        System.out.println("Person's Id : "+pid);
        System.out.println("Person's Name : "+name);
        System.out.println("Person's Address : "+address.city+"  "+address.state);
    }
    public static void main(String args[]){
        Address address = new Address("Madhya Pradesh","Indore");
        Person p1 = new Person(1012,"Andrew Anderson",address);
        Person p2 = new Person(p1);
            p2.address.state = "Gujrat";
            p2.address.city = "Surat";
        p1.display();
        p2.display();
    }
}

/*
    shallow copy
    -------------
    obj1                             obj2
    |                                 |
    |--rno--------102------------rno--|
    |--name-------andrew---------name-|
    |--per--------78.89----------per--|


    deep copy
    -------------
    obj1                                         obj2
    |                                              |
    |--rno--------103          102------------rno--|
    |--name-------andrew       andrew---------name-|
    |--per--------78.89        78.89----------per--|


*/


