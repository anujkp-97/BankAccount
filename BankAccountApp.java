import java.util.*;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Checking [2] Saving ");
        System.out.println("Enter your Account Choice: ");
        int number = sc.nextInt();

            String AccountHolderName ;
            String SSNNumber ;
            int initialAMount;
            
            double depositAmount;
             double transAmount;
              double withdrawAmount ;
               String TransferTo;

        switch(number)
        {
            
            case 1: System.out.println("Enter Account Holder Name: ");
                    AccountHolderName = sc.next();
                    System.out.println("Enter 10 Digit SSN number: ");
                    SSNNumber = sc.next();
                    System.out.println("Enter Initial Amountfor Deposit: ");
                     initialAMount = sc.nextInt();

                    checking ch1 = new checking(AccountHolderName , SSNNumber , initialAMount);

                    System.out.println("[1] Deposit [2] Withdraw [3] Transfer [4]ShowInfo");
                    int enterChoice = sc.nextInt();

                    switch(enterChoice)
                    {
                        case 1: System.out.println("Enter amount for deposit: ");
                                 depositAmount = sc.nextDouble();
                                    ch1.deposit(depositAmount);
                                    ch1.showInfo();
                                    break;
                        case 2: System.out.println("Enter amount for Withdraw: ");
                                 withdrawAmount = sc.nextDouble();
                                    ch1.withdraw(withdrawAmount);
                                    ch1.showInfo();
                                    break;

                        case 3: System.out.println("Enter transfer amount: ");
                                 transAmount = sc.nextDouble();
                                System.out.println("Amount Transfer to(name): ");
                                 TransferTo = sc.next();
                                ch1.transfer(TransferTo, transAmount);
                                    ch1.showInfo();
                                    break;

                        case 4: System.out.println("Show the Information of AccountHolder: ");
                                    ch1.showInfo();
                                    System.out.println("Do you want to perform next(true/false): ");
                                    
                                    boolean nextChoice = sc.nextBoolean();
                                    if(nextChoice==true)
                                    {
                                         System.out.println("[1] Deposit [2] Withdraw [3] Transfer [4]ShowInfo");
                                     int Choice = sc.nextInt();

                                     switch(Choice)
                                         {
                                             case 1: System.out.println("Enter amount for deposit: ");
                                                     depositAmount = sc.nextDouble();
                                                     ch1.deposit(depositAmount);
                                                      break;
                                            case 2: System.out.println("Enter amount for Withdraw: ");
                                                        withdrawAmount = sc.nextDouble();
                                                         ch1.withdraw(withdrawAmount);
                                                             break;

                                             case 3: System.out.println("Enter transfer amount: ");
                                                         transAmount = sc.nextDouble();
                                                        System.out.println("Amount Transfer to(name): ");
                                                          TransferTo = sc.next();
                                                         ch1.transfer(TransferTo, transAmount);
                                                          break;
                                             default: System.out.println("Enter the right choice!");
                                        }
                                    }
                               
                        
                                             
                    }
                        break;

                case 2: 
                    System.out.println("Enter Account Holder Name: ");
                    AccountHolderName = sc.next();
                    System.out.println("Enter 10 Digit SSN number: ");
                    SSNNumber = sc.next();
                    System.out.println("Enter Initial Amountfor Deposit: ");
                     initialAMount = sc.nextInt();

                    Savings sav = new Savings(AccountHolderName , SSNNumber , initialAMount);

                    System.out.println("[1] Deposit [2] Withdraw [3] Transfer [4]ShowInfo");
                    int enterChoice2 = sc.nextInt();

                    switch(enterChoice2)
                    {
                        case 1: System.out.println("Enter amount for deposit: ");
                                 depositAmount = sc.nextDouble();
                                    sav.deposit(depositAmount);
                                    sav.showInfo();
                                    break;
                        case 2: System.out.println("Enter amount for Withdraw: ");
                                 withdrawAmount = sc.nextDouble();
                                    sav.withdraw(withdrawAmount);
                                    sav.showInfo();
                                    break;

                        case 3: System.out.println("Enter transfer amount: ");
                                 transAmount = sc.nextDouble();
                                System.out.println("Amount Transfer to(name): ");
                                 TransferTo = sc.next();
                                sav.transfer(TransferTo, transAmount);
                                sav.showInfo();
                                    break;

                        case 4: System.out.println("Show the Information of AccountHolder: ");
                                    sav.showInfo();
                                    System.out.println("Do you want to perform next(true/false): ");
                                    
                                    boolean nextChoice = sc.nextBoolean();
                                    if(nextChoice==true)
                                    {
                                         System.out.println("[1] Deposit [2] Withdraw [3] Transfer [4]ShowInfo");
                                     int Choice = sc.nextInt();

                                     switch(Choice)
                                         {
                                             case 1: System.out.println("Enter amount for deposit: ");
                                                     depositAmount = sc.nextDouble();
                                                     sav.deposit(depositAmount);
                                                      break;
                                            case 2: System.out.println("Enter amount for Withdraw: ");
                                                        withdrawAmount = sc.nextDouble();
                                                         sav.withdraw(withdrawAmount);
                                                             break;

                                             case 3: System.out.println("Enter transfer amount: ");
                                                         transAmount = sc.nextDouble();
                                                        System.out.println("Amount Transfer to(name): ");
                                                          TransferTo = sc.next();
                                                         sav.transfer(TransferTo, transAmount);
                                                          break;
                                             default: System.out.println("Enter the right choice!");
                                        }
                                    }
                               }
                                break;
                default: System.out.println("OOPS! Choose the right Bank Account Type");

        }
    
       

        
       
         

  
        

      


        
    }
}
