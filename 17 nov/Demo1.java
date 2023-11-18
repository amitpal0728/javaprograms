// program showing the concept of File Handling

import java.io.*;
class Product implements Serializable{
    int pid;
    String name;
    double price;
    
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return pid+"\t"+name+"\t"+price;
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj = new Product(1234,"Fairness Cream",67.78);
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout)){  
            oos.writeObject(pobj);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }       
    }
}