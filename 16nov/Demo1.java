// program showing the concept of file handling
import java.io.*;
import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String content = sc.nextLine();

        File obj = new File("file2.txt");            
        try{
            FileOutputStream fout = new FileOutputStream(obj,true);
            byte bt[] = content.getBytes();
            fout.write(bt);
            fout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}