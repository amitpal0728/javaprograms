// program showing the concept of two dimensional array

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter array elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nArray elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print("\t"+element);
            }
            System.out.println("\n");
        }
    }
}