import java.io.File;
class Demo2{
    public static void main(String args[]){
        File file = new File("/Users/paragagnihotri/Documents/JavaPrograms/myFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder Created Successfully");
        }
        else
            System.out.println("Folder Already exist");
    }
}