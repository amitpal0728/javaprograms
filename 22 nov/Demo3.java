// program showing the concept of strings
import java.util.StringJoiner;
class Demo3{
    public static void main(String args[]){
      StringJoiner sj = new StringJoiner("*");
      sj.add("andrew");
      sj.add("mathew");
      sj.add("simon");
      System.out.println(sj);
    }
}