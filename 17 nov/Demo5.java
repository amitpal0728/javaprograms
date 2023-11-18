import java.io.*;
class Demo5{
    public static void main(String args[]){
        File file = new File("C:\\Users\\hp\\Desktop\\primestep\\17 nov\\file.txt");
        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw= new BufferedWriter(fw)){
            bw.write("statement 1");
            bw.newLine();
            bw.write("statement 2");
            bw.newLine();
            bw.write("statement 3");
            System.out.println("Data inserted successfully");

        }
        catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}