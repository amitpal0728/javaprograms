// program showing the concept of File Handling

import java.io.*;
class Demo4{
    public static void main(String args[]){
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileReader fr = new FileReader(file)){  
            while(true){
                int i = fr.read();
                if(i==-1)
                    break;
            System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }       
    }
}