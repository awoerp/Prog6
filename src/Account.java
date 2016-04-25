/**This class is the abstract super class of the three account types,
 * checking, money market, and savings. It keeps track of the account
 * numbers also.
 *
 * @author SteveWoerpel  & Andy Woerpel
 */
public abstract class Account 
{
   private static int numAccount = 1000;
   protected final int PERCENTAGE = 100;
   protected final int MONTH_PER_YEAR = 12;
   protected Profile holder;
   protected int accNumber;
   protected double balance;
   protected Date openOn;
   
   public abstract void applyInterestAndFee();
   public abstract String toString();
   
   /**
    * This constructor is used when super is called on a sub class
    * it takes a name and phone number to create a profile object
    * @param name String
    * @param phone String
    */
   public Account(String name, String phone)
   {
      openOn = new Date();
      balance = 0;
      holder = new Profile(name, phone);
      accNumber = numAccount++;
   }
   
    /**
    * This constructor is used when super is called on a sub class
    * it takes a name and phone number to create a profile object
    * @param name String
    * @param phone String
    */
   public Account(String name, String phone, float b, Date d)
   {
      openOn = d;
      balance = b;
      holder = new Profile(name, phone);
      accNumber = numAccount++;
   }

   
   /**
    * This method compares two accounts based on their type of subclass
    * @param a general account
    * @return true if equal, false if not.
    */
   public boolean equals(Account a)
   {
      Object thisType = this.getClass();
      Object aType = a.getClass();
      boolean accoutTypesMatch = false;
      if(aType.equals(thisType))
      {
         accoutTypesMatch = true;
      }
      boolean accountHolderMatchs = holder.equals(a.holder);
      
      if(accoutTypesMatch && accountHolderMatchs)
         a.accNumber = this.accNumber;
      
      return accoutTypesMatch && accountHolderMatchs;
   }   
   
   /**
    * returns the account number of a given account
    * @return the account number of a given account
    */
   public int getAccountNum()
   {
      return accNumber;
   }
   
   /**
    * returns the name of an account holder
    * @return string name
    */
   public String getName()
   {
      return holder.getName();
   }
   
   /**
    * returns phone number of account holder
    * @return string phone number
    */
   public String getPhoneNumber()
   {
      return holder.getPhoneNumber();
   }
   
   /**
    * decrements the number of accounts
    */
   public void decreaseNumberOfAccounts()
   {
      numAccount--;
   }
   
   public void debit(double amount) //subtract the amount from the balance
   {
      Object a = this.getClass();
      if(a instanceof MoneyMarket)
      {

      }
      balance -= amount;
   }
   
   public void credit(double amount) //add the amount to the balance
   {
      balance += amount;
   }
   
   public Date getDate()
   {
      return openOn;
   }
}
