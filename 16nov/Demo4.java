// program showing the concept of file handling
import java.io.*;
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        File obj1 = new File("file1.txt");            
        File obj2 = new File("file2.txt");            

        try(FileInputStream fin1 = new FileInputStream(obj1);
        FileInputStream fin2 = new FileInputStream(obj2);
        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
        ){
            while(true){
                int i = sin.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }
            sin.close();
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}