import java.io.*;
class Demo7{
    public static void main(String args[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Enter Name : ");
            String name = br.readLine();

            System.out.println("Enter Age : ");
            String age = br.readLine();

            System.out.println("Name : "+name+" \nAge : "+age);
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}