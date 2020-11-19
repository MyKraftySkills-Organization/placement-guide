import java.util.Scanner;

public class ATM{

    public static void displayMenu(){
        System.out.println("\t ATM ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Withdraw Cash");
        System.out.println("4. Exit");
        System.out.print("Enter Operation number: ");
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int balance = 1000, withdraw, deposit;
        int choice;
        do{
            displayMenu();
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Balance Amount: " + balance);     
                break;
                case 2:
                System.out.print("Enter amount to deposit: ");
                deposit = sc.nextInt();
                balance += deposit;
                System.out.print(deposit + " has been deposited. Current balance :" + balance);  
                System.out.println();              
                break;
                case 3:
                System.out.print("Enter amount to withdraw: ");
                withdraw = sc.nextInt();
                if(withdraw <= balance)
                {
                    balance -=withdraw;
                    System.out.print(withdraw + " has been withdrawn. Current balance :" + balance);
                    System.out.println();
                }
                else {
                    System.out.println("Balance Insufficent. Current balance :" + balance);
                }
                break;
                case 4:
                System.out.println("Exit Successful. Don't forget to take your atm card");
                break;

                default:
                System.out.println("Trasaction Failed. Don't forget to take your atm card");
                System.exit(0);
            }
        }while(choice!=4);

        sc.close();
    }
}