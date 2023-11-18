// program showing the concept of file handling
import java.io.*;
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String content = sc.nextLine();

        File obj1 = new File("file1.txt");            
        File obj2 = new File("file2.txt");            

        try(FileOutputStream fout1 = new FileOutputStream(obj1);
        FileOutputStream fout2 = new FileOutputStream(obj2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ){
            byte bt[] = content.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}