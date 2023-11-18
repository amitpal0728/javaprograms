// program showing the concept of Exception Handling

import java.io.IOException;
import java.util.Scanner;
class Demo3{
    void divide(int a,int b){
        try{
            int c = a/b;
                if(c>=5)
                    throw new ArithmeticException("Result greater than or equals to 5");
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
        Demo3 obj = new Demo3();
        obj.divide(a,b);
    }
}