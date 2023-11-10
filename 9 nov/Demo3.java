// program showing the concept of reversing an array

import java.util.Scanner;
class Demo3{
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
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
 
        for(int i=0;i<size/2;i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
        
        System.out.println("\nArray elements after reversing  : \n");
        for(int elem : arr){
            System.out.print(" "+elem);
        }
        
    }
}
