// program showing the concept of abstract class

abstract class RBI{
    abstract double rate();
    RBI(){
        System.out.println("--Welcome to Bank--");
    }
    double finalSum(int bal,double rate){
        return bal+bal*rate/100;
    }
}

class SBI extends RBI{
    double rate(){
        return 1.23;
    }
}
class BOI extends RBI{
    double rate(){
        return 2.23;
    }
}

class Demo2{
    public static void main(String args[]){
        RBI obj;
        int bal=10000;
            obj = new SBI();
            System.out.println("Final sum by SBI : "+obj.finalSum(bal,obj.rate()));
            obj = new BOI();
            System.out.println("Final sum by BOI : "+obj.finalSum(bal,obj.rate()));
    }
}
