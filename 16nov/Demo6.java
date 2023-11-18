// program showing the concept of file handling
import java.io.*;
class Demo6{
    public static void main(String args[]){
        File obj = new File("file.txt");            

        try(FileInputStream fout = new FileInputStream(obj);
        DataInputStream dout = new DataInputStream(fout);
        ){
            System.out.println(dout.readInt());
            System.out.println(dout.readUTF());
           System.out.println(dout.readBoolean());
           
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}