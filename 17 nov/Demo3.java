// program showing the concept of File Handling

import java.io.*;
class Demo3{
    public static void main(String args[]){
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileWriter fw = new FileWriter(file)){  
            fw.write("statement 1");
            fw.write("statement 2");
            fw.write("statement 3");
            
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }       
    }
}