import java.io.File;
import java.io.IOException;
class Demo3{
    public static void main(String args[]){
        File file = new File("/Users/paragagnihotri/Documents/JavaPrograms/myFolder/file.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File Created Successfully");
            }
            else
                System.out.println("File Already exist");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }        
    }
}