/** This class is a child class of account. It has different information
 * that is specific to a checking account. It has its own too string 
 * method and constructors.
 * @author SteveWoerpel & Andy Woerpel
 */
public class Checking extends Account 
{
   private static final int FEE = 25;
   private static final double APY = .05;
   private static final double MIN_BAL = 1500;
   private boolean directDeposit; //no fees if this is true
   
   /**
    * This creates an object based on a name, phone number, and the 
    * option of having direct deposit.
    * @param name string
    * @param phone string
    * @param dd boolean
    */
   public Checking(String name, String phone, boolean dd)
   {
      super(name, phone);
      directDeposit = dd;
   }
   
    /**
    * This creates an object based on a name, phone number, and the 
    * option of having direct deposit.
    * @param name string
    * @param phone string
    * @param dd boolean
    */
   public Checking(String name, String phone, float balance, Date d,  boolean dd)
   {
      super(name, phone, balance, d);
      directDeposit = dd;
   }
   
   /**
    * Creates a checking object without increasing the account number
    * @param name String
    * @param phone String
    */
   public Checking(String name, String phone)
   {
      super(name, phone);
      directDeposit = false;
      super.decreaseNumberOfAccounts();
   }
   
   /**
    * unused in program 5
    */
   public void applyInterestAndFee()
   {
      if(!directDeposit)
      {
         if(balance < MIN_BAL)
         {
            balance -= FEE;
         }
      }
      balance = balance + (balance * APY) / MONTH_PER_YEAR;
   }
   
   /**
    * returns the account information as a string
    * @return String
    */
   /**
   public String toString()
   {
      String deposit;
      if(directDeposit)
         deposit = "Yes";
      else 
         deposit = "No";
      
      return("Account number:      " + Integer.toString(accNumber) + "\n" 
              + holder.toString() +
             "Account Type:            Checking" + "\n" +
             "Date Opened:            " + openOn.toString() + "\n" +
             "Direct Deposit:          " + deposit);
   } 
   * */
   
   public String toString()
   {
      String deposit;
      if(directDeposit)
         deposit = "Direct Deposit";
      else
         deposit = "Regular";
      return(holder.toString() + "AccNum: " + Integer.toString(accNumber) + " Type: Checking " + "**" + openOn.toString() + "**" + deposit + " Balance: " + Double.toString(balance));
                 
   }
}
