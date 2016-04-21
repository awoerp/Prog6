/** This class is a child class of account. It has different information
 * that is specific to a savings account. It has its own too string 
 * method and constructor.
 * @author SteveWoerpel & Andy Woerpel
 */
public class Savings extends Account
{
   private static final int FEE = 5;
   private static final double APY = .25;
   private static final double MIN_BAL = 300;
   private boolean special; // the interest rate is .35 if this is true
   
   /**
   * This creates an object based on a name, phone number, and the option
   * of creating a special savings account.
   * @param name String
   * @param phone String
   * @param ssa boolean
   */
   public Savings(String name, String phone, boolean ssa)
   {
      super(name, phone);
      special = ssa;
   }
   
   /**
    * creates a new savings account without increasing account number.
    * @param name String
    * @param phone String
    */
   public Savings(String name, String phone)
   {
      super(name, phone);
      special = false;
      super.decreaseNumberOfAccounts();
   }
   
   public Savings(String name, String phone, float balance, Date d,  boolean ss)
   {
      super(name, phone, balance, d);
      special = ss;
   }
   
   /**
    * unused in program 5
    */
   public void applyInterestAndFee()
   {
      
   }
   
   /**
    * returns the account information as a string
    * @return String
    */   
   /**public String toString()
   {
      String specialAccount;
      if(special)
         specialAccount = "Yes";
      else 
         specialAccount = "No";
      return("Account number:      " + Integer.toString(accNumber) + "\n"
              + holder.toString() +
             "Account Type:            Savings" + "\n" +
             "Date Opened:            " + openOn.toString() + "\n" +
             "Special Account:        " + specialAccount);
   }
   */
   
   public String toString()
   {
      String specialAccount;
      if(special)
         specialAccount = "special";
      else
         specialAccount = "regular";
      return(holder.toString() + "AccNum: " + Integer.toString(accNumber) + " Type: Savings " + "**" + openOn.toString() + "**" + specialAccount + " Balance: " + Double.toString(balance));
                 
   }
}

