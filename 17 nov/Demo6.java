import java.io.*;
class Demo6{
    public static void main(String args[]){
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br= new BufferedReader(fr)){
            while(true){
                int i = br.read();
                if(i==-1)
                    break;
                System.out.print((char)i);}

        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}