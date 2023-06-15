public class checking extends Account{

    //List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;


    //Constructor to initialize the checking property
    public checking(String name , String sSN , double initDeposit){
        super(name , sSN , initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
 
       
    }

    //List any methods specific to the checking account
    private void setDebitCard()
    {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }





    public void showInfo()
    {
        super.showInfo();   //overriding ki problem ko khatam krta hai
        System.out.println("Your Checking Account features" +
            "\n Debit Card Number: " + debitCardNumber + 
            "\n Debit Card Pin: " + debitCardPin
        );
    }
    
}
