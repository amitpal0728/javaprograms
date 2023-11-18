// program showing the concept of array of object
import java.util.Scanner;
class Product{
    int pid;
    String name;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product name : ");
        name = sc.nextLine();
    }
    public String toString(){
        return pid+"  "+name+"\n";
    }
}
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of products : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num]; // reference array
        System.out.println("\n--Enter Product Details--\n");
        for(int i=0;i<num;i++){
            pobj[i] = new Product();
            pobj[i].getDetails();
        }
        System.out.println("\n--Product Details--\n");
        for(Product p : pobj){
            System.out.println(p);
        }
    }
}
