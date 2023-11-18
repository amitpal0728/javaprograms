// program showing the concept of Exception Handling

import java.util.Scanner;
class Demo2{
    void divide(int a,int b){
        try{
            int c = a/b;
            System.out.println("Result : "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo2 obj = new Demo2();
        obj.divide(a,b);
    }
}