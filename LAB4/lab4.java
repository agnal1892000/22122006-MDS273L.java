
import java.util.Scanner;
public class lab4 {
    public static void main(String[]args){
   Scanner scan=new Scanner(System.in);
    System.out.println("Enter the account number: ");
    String account=scan.nextLine();
   System.out.println("Enter the name:");
   String name=scan.nextLine();
 System.out.println("Enter the  balance:");
 int balance = Integer.parseInt(scan.nextLine());
    


    System.out.println("1.amount to deposit money\n2.withdraw money\n3. the transactions\n4.account summary");
        int userChoice=Integer.parseInt(scan.nextLine());
        switch(userChoice){
            case 1:
            float amount;
            System.out.println("amount to deposit");
            amount=scan.nextFloat();
           if(amount<=0){
           System.out.println("can't deposit the money");
           }
           else{
            balance +=amount;
            System.out.println("balance");
           }
           
           break;
           case 2:
           System.out.println("amount to withdraw");
           amount=scan.nextFloat();
           if(amount<=0 || amount>balance){
            System.out.println("withdrawal can't be completed");
           }
           else{
            balance -=amount;
            System.out.println("balance");
           }
           break;
        case 3:
        System.out.println("the transactions");
        amount=scan.nextFloat();
        System.out.println("amount to deposit");
        System.out.println("amount to withdraw");
        break;

        case 4:
        System.out.println("account summary");
        System.out.println("1.account number\n2.name\n3.balance");
break;




    
}
}
}
 