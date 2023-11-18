// program showing the concept of file handling
import java.io.*;
class Demo5{
    public static void main(String args[]){
        File obj = new File("file.txt");            

        try(FileOutputStream fout = new FileOutputStream(obj);
        DataOutputStream dout = new DataOutputStream(fout);
        ){
            dout.writeInt(1234);
            dout.writeUTF("Hello User");
            dout.writeBoolean(true);
            dout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}