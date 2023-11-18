// program showing the concept of file handling
import java.io.*;
class Demo2{
    public static void main(String args[]){
        File obj = new File("file2.txt");            
        try(FileInputStream fin = new FileInputStream(obj)){
            while(true){
                int i = fin.read();
                if(i==-1)
                    break;
                System.out.print((char)i);        
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}