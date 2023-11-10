// program showing the concept of array | inserting an element at specific position

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        // declaring an array
        int arr[]=new int[size+1];

        // taking values from user
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // displaying array elements
        System.out.println("\nArray elements are : \n");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nEnter index : ");
        int index = sc.nextInt();

        System.out.println("Enter element : ");
        int element = sc.nextInt();

        for(int i=size-1;i>=index;i--){
            arr[i+1] = arr[i];
        }    
        arr[index] = element;

        System.out.println("\nArray elements are : \n");
        for(int elem : arr){
            System.out.print(" "+elem);
        }
        
    }
}
