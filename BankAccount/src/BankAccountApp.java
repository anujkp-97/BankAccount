import java.util.*;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {

    
       
        checking  chacc1 = new checking("Tom Wilson" , "3214566879" , 1500);

        
        //This method show the information of the account holder of checking account  
        chacc1.showInfo();
        chacc1.deposit(1000);
        chacc1.withdraw(500);
        
         

  
        System.out.println("*----------------------------------*");

        //We are creating the object of saving account
        Savings sav = new Savings("Anuj Kumar", "4563237898" , 12000); 
        sav.deposit(1000);
        System.out.println("\n");
        sav.withdraw(2000);
        System.out.println("\n");
        sav.transfer("Wilson Singh", 2000);
        System.out.println("\n");
        sav.showInfo();
        

      


        
    }
}
