// program showing the concept of jagged array

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r = sc.nextInt();

        int arr[][] = new int[r][];

        for(int i=0;i<r;i++){
            System.out.println("Enter column for "+(i+1)+" row : ");
            int c = sc.nextInt();
            arr[i] = new int[c];
            System.out.println("Enter elements : ");
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