// program showing the concept of File Handling

import java.io.*;
class Demo2{
    public static void main(String args[]){
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fin)){  
            Object obj = ois.readObject();
            System.out.println(obj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }       
    }
}