// program showing the concept of array of object

class Product{
    int pid;
    String name;

    Product(int pid,String name){
        this.pid=pid;
        this.name=name;
    }
}
class Demo4{
    public static void main(String args[]){
        
        Product pobj[] = new Product[2]; // reference array
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);
        
        pobj[0] = new Product(101,"Soap");
        pobj[1] = new Product(102,"Fairness Cream");

        System.out.println("\npobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);
      
        // This Product pobj[] = new Product[2]; becomes array of object

        for(Product p : pobj){
            System.out.println("\nProduct Id : "+p.pid);
            System.out.println("Product Name : "+p.name);
        }
    }
}
