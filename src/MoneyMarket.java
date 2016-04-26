/** This class is a child class of account. It has different information
 * that is specific to a money market account. It has its own too string 
 * method and constructor.
 * @author SteveWoerpel & Andy Woerpel
 */
public class MoneyMarket extends Account
{
   private static final int FEE = 12;
   private static final double APY = .65;
   private static final double MIN_BAL = 2500;   
   private static final int WITHDRAW_LIMIT = 6;
   private int withdrawals;
   
    /**
    * This creates an object based on a name, phone number, and also sets
    * the number of withdrawals to zero.
    * @param name String
    * @param phone String
    */
   public MoneyMarket(String name, String phone)
   {
      super(name, phone);
      withdrawals = 0;
   }
   
   public MoneyMarket(String name, String phone, float balance, Date d)
   {
      super(name, phone, balance, d);
   }
   /**
    * Creates a new MoneyMarket account that doesnt increase the account
    * number.
    * @param name String
    * @param phone String
    * @param special boolean
    */
   public MoneyMarket(String name, String phone, boolean special)
   {
      super(name, phone);
      withdrawals = 0;
      super.decreaseNumberOfAccounts();
   }
   
   /**
    * 
    */
   public void applyInterestAndFee()
   {
      if(balance < MIN_BAL)
      {
         balance -= FEE;
      }
      balance = balance + (balance * APY) / MONTH_PER_YEAR;
   }
   
   public boolean incrementWithdrawals()
   {
      withdrawals++;
      if(withdrawals <= WITHDRAW_LIMIT)
         return true;
      withdrawals--;
      return false;
   }
    /**
    * returns the account information as a string
    * @return String
    */
   /**
   public String toString()
   {
      return("Account number:      " + Integer.toString(accNumber) + "\n" 
              + holder.toString() +
             "Account Type:            Money Market" + "\n" +
             "Date Opened:            " + openOn.toString());
   }
   */
   
   public String toString()
   {
      return(holder.toString() + "AccNum: " + Integer.toString(accNumber) + " Type: Money Market " + "**" + openOn.toString() + " Balance: " + Double.toString(balance));      
   }
   
}
