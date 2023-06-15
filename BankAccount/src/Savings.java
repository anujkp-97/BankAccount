public class Savings extends Account {
     //List properties specific to a SAVING account
        int safetyDepositBoxID;
        int safetyDepositBoxKey;
    //Constructor to initialize the saving property
    public Savings(String name , String sSN , double initDeposit){
        super(name, sSN , initDeposit) ;
        accountNumber = "1" + accountNumber;
      
        setSafetyDepositBox();
       
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
       safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }
   

    //List any methods specific to the saving account
    public void showInfo()
    {
        super.showInfo();
        System.out.println(
            "Your Saving Account features: " +
            "\nSafety Deposit Box ID: " + safetyDepositBoxID + 
            "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
       
    }
    
}
 