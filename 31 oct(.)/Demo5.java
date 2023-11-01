// program showing the concept of constructor overloading

import java.util.Scanner;
class Demo5{
    Demo5(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    Demo5(int a,int b,int c){
        int res = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Greater number : "+res);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        new Demo5(num2, num3);
        new Demo5(num1, num2, num3);
    }   
}