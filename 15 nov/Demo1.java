import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Bank{
    int bal;
    void getbalance() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        bal = sc.nextInt();

        Withdrawal obj = new Withdrawal(bal);
        obj.getWithdraw();
    }
}
class Withdrawal{
    int wamt,bal;
    Withdrawal(int bal){
        this.bal=bal;
    }
    void getWithdraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter withdrawal amount : ");
        wamt = sc.nextInt();

        if(wamt>bal)
            throw new InsufficientBalanceException("Low balance");
        else{
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }
    }
}
class Demo1{
    public static void main(String args[]){
    Bank bank = new Bank();
    try{
        bank.getbalance();    
    }catch(InsufficientBalanceException e){
        System.out.println("Exception : "+e.getMessage());
    }
        
    }
}