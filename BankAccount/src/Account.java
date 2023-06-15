public abstract class  Account {
    //List commom properties for savings and checking account
       private String name;
       private String sSN;
        private double balance;

       private static int index = 10000;
        protected String accountNumber;
        
    //Constructor to set base properties and initialize the account
        public Account(String name, String sSN , double initDeposit){

            this.name = name; 
            this.sSN = sSN;
            balance = initDeposit ;

           // System.out.println("NAME: " + name + " SSN : " + sSN + " Balance : " + balance);
          
            //Set account number
            index++;
            this.accountNumber = setAccountNunber();
           
           
        }

        private String setAccountNunber(){
            String lastTwoOfSSN = sSN.substring(sSN.length()-2 , sSN.length());
           int uniqueId =index;
           int randomnumber = (int)(Math.random() * Math.pow(10,3));
            return lastTwoOfSSN + uniqueId + randomnumber;

        }
    //list common method - transaction
        public void deposit(double amount){
            balance = balance + amount;
            System.out.println("Deposit Rs. " + amount);
            printBalance();
        }
        public void withdraw(double amount){
            balance = balance - amount;
            System.out.println("Withdraw Rs. " + amount);
            printBalance();
        }

        public void transfer(String toWhere , double amount){
            balance = balance - amount;

            System.out.println("Transferring Rs. " + amount + " to " + toWhere);
                printBalance();
        }

        public void printBalance(){
            System.out.println("Your Current Balance is Rs." + balance);
        }


        public void showInfo()
        {
            System.out.println(
                "NAME: " + name + 
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
            );
        }

}
