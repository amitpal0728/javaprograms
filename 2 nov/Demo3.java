
/*
 Final Keyword : 
 |-- 1 variable
 |-- 2 method
 |-- 3 class
*/

// program showing the concept of final keyword

class Demo3{
    public static void main(String args[]){
        final int arr[] = {11,22,33,44,55};
        
        System.out.println("Array elements are : ");
        for(final int element : arr){
            System.out.print(element+" ");
        }

    }
}