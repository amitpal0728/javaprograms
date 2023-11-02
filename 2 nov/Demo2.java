
/*
 Final Keyword : 
 |-- 1 variable
 |-- 2 method
 |-- 3 class
*/

// program showing the concept of final keyword

class Demo2{
    public static void main(String args[]){
        final int arr[] = {11,22,33,44,55};
        arr[2] = 400;
        
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print(element+" ");
        }

        int arr2[] = {1,2,3,4,5};
        arr2 = arr; 
        System.out.println("\nArray elements are : \n");
        for(int element : arr2){
            System.out.print(element+" ");
        }
    }
}