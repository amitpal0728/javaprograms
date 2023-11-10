// program showing the concept of array

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        // declaring an array
        int arr[]=new int[size];

        // taking values from user
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // displaying array elements
        System.out.println("\nArray elements are : \n");
        for(int element : arr){
            System.out.print(" "+element);
        }
    }
}