/**This is the class that contains the graphical user interface.
 * it creates buttons, text fields, and everything a user needs to 
 * use the program.
 * @author SteveWoerpel
 */

import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.BufferedImage;
import java.lang.Exception;
import java.util.*;

public class TransactionManager extends javax.swing.JFrame {


   /**
    * Creates new form TransactionManager
    * Sets initial Conditions of buttons and check boxes
    */
   public TransactionManager() {
      initComponents();
      directDeposit.setEnabled(true);
      specialSavingsAccount.setEnabled(false);
      checking.setSelected(true);
      this.setTitle("Woe Woe Financial Applications \u00A9");
      loadAccounts.setToolTipText("This will load all accounts which are "
                                  + "currently on file.");
   }

   /**
    * This method is called from within the constructor to initialize the
    * form. WARNING: Do NOT modify this code. The content of this method
    * is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jRadioButton4 = new javax.swing.JRadioButton();
      jTextField1 = new javax.swing.JTextField();
      accountTypeGroup = new javax.swing.ButtonGroup();
      searchOption = new javax.swing.JPopupMenu();
      jPanel1 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      phoneNumberField = new javax.swing.JTextField();
      nameField = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      openAccount = new javax.swing.JButton();
      closeAccount = new javax.swing.JButton();
      withdraw = new javax.swing.JButton();
      runMonthlyInterestAndFees = new javax.swing.JButton();
      deposit = new javax.swing.JButton();
      loadAccounts = new javax.swing.JButton();
      jLabel8 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      list = new javax.swing.JList();
      savings = new javax.swing.JRadioButton();
      specialSavingsAccount = new javax.swing.JCheckBox();
      directDeposit = new javax.swing.JCheckBox();
      jPanel3 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      accountNumberField = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      dateOpenedField = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      balanceField = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      transactionAmount = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      jTextField5 = new javax.swing.JTextField();
      checking = new javax.swing.JRadioButton();
      moneyMarket = new javax.swing.JRadioButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      statisticsArea = new javax.swing.JTextArea();
      showAccounts = new javax.swing.JButton();
      jLabel9 = new javax.swing.JLabel();
      DateTextField = new javax.swing.JTextField();
      jLabel10 = new javax.swing.JLabel();

      jRadioButton4.setText("Checking");

      jTextField1.setText("jTextField1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel2.setText("Phone Number");

      phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            phoneNumberFieldActionPerformed(evt);
         }
      });

      nameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            nameFieldActionPerformed(evt);
         }
      });

      jLabel1.setText("Name");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(53, 53, 53)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
               .addComponent(phoneNumberField))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      openAccount.setText("Open New Account");
      openAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            openAccountActionPerformed(evt);
         }
      });

      closeAccount.setText("Close Account");
      closeAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            closeAccountActionPerformed(evt);
         }
      });

      withdraw.setText("Withdraw");
      withdraw.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            withdrawActionPerformed(evt);
         }
      });

      runMonthlyInterestAndFees.setText("Run Monthly Interest and Fees");
      runMonthlyInterestAndFees.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            runMonthlyInterestAndFeesActionPerformed(evt);
         }
      });

      deposit.setText("Deposit");
      deposit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            depositActionPerformed(evt);
         }
      });

      loadAccounts.setText("Load Accounts");
      loadAccounts.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            loadAccountsActionPerformed(evt);
         }
      });

      jLabel8.setText("Current Accounts:");

      jScrollPane2.setViewportView(list);

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(openAccount)
                        .addGap(18, 18, 18)
                        .addComponent(closeAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addComponent(loadAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(runMonthlyInterestAndFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel8)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(openAccount)
               .addComponent(closeAccount)
               .addComponent(withdraw)
               .addComponent(deposit))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(runMonthlyInterestAndFees)
               .addComponent(loadAccounts))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      accountTypeGroup.add(savings);
      savings.setText("Savings");
      savings.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            savingsActionPerformed(evt);
         }
      });

      specialSavingsAccount.setText("Special Savings Account");

      directDeposit.setText("Direct Deposit");

      jLabel4.setText("Account Number:");

      accountNumberField.setEditable(false);
      accountNumberField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            accountNumberFieldActionPerformed(evt);
         }
      });

      jLabel5.setText("Date Opened:");

      dateOpenedField.setEditable(false);
      dateOpenedField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            dateOpenedFieldActionPerformed(evt);
         }
      });

      jLabel6.setText("Balance:");

      balanceField.setEditable(false);

      jLabel3.setText("Transaction Amount:");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(dateOpenedField)
                     .addComponent(accountNumberField)))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(transactionAmount))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(accountNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(dateOpenedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(transactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
      );

      jLabel7.setText("Withdrawals");

      jTextField5.setEditable(false);

      accountTypeGroup.add(checking);
      checking.setText("Checking");
      checking.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            checkingActionPerformed(evt);
         }
      });

      accountTypeGroup.add(moneyMarket);
      moneyMarket.setText("Money Market");
      moneyMarket.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            moneyMarketActionPerformed(evt);
         }
      });

      statisticsArea.setColumns(20);
      statisticsArea.setRows(5);
      jScrollPane1.setViewportView(statisticsArea);

      showAccounts.setText("Show Accounts");
      showAccounts.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            showAccountsActionPerformed(evt);
         }
      });

      jLabel9.setText("Show Accounts Opend Before:");

      jLabel10.setText("(mm/dd/yy)");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(savings)
                                 .addComponent(checking)
                                 .addComponent(moneyMarket))
                              .addGap(18, 18, 18)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                       .addComponent(specialSavingsAccount)
                                       .addGroup(layout.createSequentialGroup()
                                          .addComponent(jLabel7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jTextField5)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                 .addGroup(layout.createSequentialGroup()
                                    .addComponent(directDeposit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(8, 8, 8)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addContainerGap())))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(directDeposit)
                     .addComponent(checking))
                  .addGap(4, 4, 4)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(savings)
                     .addComponent(specialSavingsAccount))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel7)
                     .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(moneyMarket)))
               .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(showAccounts, javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel9)
                  .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel10)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   BankDataBase data = new BankDataBase();
   Vector visualData = new Vector<Account>();
   

   
   private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
      
   }//GEN-LAST:event_phoneNumberFieldActionPerformed

   private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

   }//GEN-LAST:event_nameFieldActionPerformed

   /**
    * creates an account based on name, phone number, and which type is 
    * selected. checks for bad input and displays error message. Prints
    * success message in statistics area.
    * @param evt 
    */
   private void openAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAccountActionPerformed
      String nameFieldText = nameField.getText();
      String phoneNumberFieldText = phoneNumberField.getText();
      boolean added = false;
      statisticsArea.setText(null);
      Account dumbyAccount = getDumbyAccount(nameFieldText, phoneNumberFieldText);
      if(isValid(dumbyAccount, true))
      {
         if(checking.isSelected())
         {
            if(directDeposit.isSelected())
            {
               added = data.add(new Checking(nameFieldText,
                                phoneNumberFieldText, true));
            }
            else
            {
               added = data.add(new Checking(nameFieldText,
                                phoneNumberFieldText, false));
            }
         }
         else if(savings.isSelected())
         {
            if(specialSavingsAccount.isSelected())
            {
               added = data.add(new Savings(nameFieldText,
                                phoneNumberFieldText, true));
            }
            else
            {
               added = data.add(new Savings(nameFieldText,
                                phoneNumberFieldText, false));
            }
         }
         else if(moneyMarket.isSelected())
            added = data.add(new MoneyMarket(nameFieldText,
                                             phoneNumberFieldText));
         if(added)
         {
            //printAddedSuccessfully(data.peek());
            dateOpenedField.setText(data.printDateMostRecent());
            accountNumberField.setText(Integer.toString(data.recentAccNum()));
            visualData.add(data.peek());
            list.setListData(visualData);
         }
      }
   }//GEN-LAST:event_openAccountActionPerformed

   /**
    * removes an account from the list given a name, phone number, and 
    * account type. Checks for bad input and displays appropriate message
    * @param evt 
    */
   private void closeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAccountActionPerformed
      Object selected = list.getSelectedValue();
      if(selected == null)
      {
         //potential Pop Up Window?
      }
      else
      {
         visualData.remove(selected);
         data.remove((Account) selected);
         list.setListData(visualData);
      }
   }//GEN-LAST:event_closeAccountActionPerformed

  
   /**
    * Creates a dummy account based on what button is pressed
    * @param name String
    * @param phone String
    * @return account object
    */
   private Account getDumbyAccount(String name, String phone)
   {
      if(checking.isSelected())
         return new Checking(name, phone);
      else if(savings.isSelected())
         return new Savings(name, phone);
      else
         return new MoneyMarket(name, phone, true);
   }
   
   /**
    * checks if a given set of inputs is valid based on what is already
    * in, or what isn't in the bag. prints appropriate error messages
    * if necessary.
    * @param add true if add command is being preformed
    * @return true if info is valid, false otherwise
   */
   private boolean isValid(Account a, boolean add)
   {
      if(nameIsValid(a.getName()))
         if(phoneIsValid(a.getPhoneNumber()))
            if(add)
               if(data.contains(a))
                  JOptionPane.showMessageDialog(new JFrame(),
                                            "Account Already Exists",
                                            "Dialog",
                                            JOptionPane.ERROR_MESSAGE); 
               else
                  return true;
            else
               return true;
         else
            JOptionPane.showMessageDialog(new JFrame(),
                                          "Invalid Phone Number Entered",
                                          "Dialog",
                                          JOptionPane.ERROR_MESSAGE);    
      else
        JOptionPane.showMessageDialog(new JFrame(),
                                       "Invalid Name Entered",
                                       "Dialog",
                                       JOptionPane.ERROR_MESSAGE); 
      return false;
   }
   
   /**
    * handles mechanics of button pressing
    * @param evt 
    */
   private void checkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingActionPerformed
      directDeposit.setEnabled(true);
      specialSavingsAccount.setEnabled(false);
      specialSavingsAccount.setSelected(false);
      
   }//GEN-LAST:event_checkingActionPerformed

   /**
    * handles mechanics of button pressing
    * @param evt 
    */
   private void savingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsActionPerformed
      specialSavingsAccount.setEnabled(true);
      directDeposit.setEnabled(false);
      directDeposit.setSelected(false);
   }//GEN-LAST:event_savingsActionPerformed

   private void moneyMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyMarketActionPerformed
      specialSavingsAccount.setSelected(false);
      directDeposit.setSelected(false);
      specialSavingsAccount.setEnabled(false);
      directDeposit.setEnabled(false);
   }//GEN-LAST:event_moneyMarketActionPerformed

   private void dateOpenedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOpenedFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_dateOpenedFieldActionPerformed

   private void accountNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_accountNumberFieldActionPerformed

   private void loadAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAccountsActionPerformed
      
      try
      {
         BufferedReader stdin = new BufferedReader(new FileReader("Prog6_1.in")); 
         String temp = stdin.readLine();
         while(temp != null)
         {
            StringTokenizer tk = new StringTokenizer(temp,",");
            String tempToken = tk.nextToken();
            String name = tk.nextToken();
            String phone = tk.nextToken();
            StringTokenizer phoneSplit = new StringTokenizer(phone, "-");
            phone = phoneSplit.nextToken() + phoneSplit.nextToken();
            Float balance = Float.parseFloat(tk.nextToken());
            Date date = new Date(tk.nextToken());
            if(tempToken.equals("C"))
            {
               Boolean dd = Boolean.parseBoolean(tk.nextToken());
               Checking c = new Checking(name, phone, balance, date, dd);
               if(!data.contains(c))
               {
                  visualData.add(c);
                  data.add(c);
               }
               else
               {
                  c.decreaseNumberOfAccounts();
                  temp = null; 
               }
            }
            else if(tempToken.equals("S"))
            {
               Boolean ss = Boolean.parseBoolean(tk.nextToken());
               Savings s = new Savings(name, phone, balance, date, ss);
               if(!data.contains(s))
               {
                  visualData.add(s);
                  data.add(s);
               }
               else
               {
                  s.decreaseNumberOfAccounts();
                  temp = null;
               }
            }
            else if(tempToken.equals("M"))
            {
               MoneyMarket m = new MoneyMarket(name, phone, balance, date);
               if(!data.contains(m))
               {
                  visualData.add(m);
                  data.add(m);
               }
               else
               {
                  m.decreaseNumberOfAccounts();
                  temp = null;
               }
            }
            temp = stdin.readLine();
         }
         
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(new JFrame(),
                                       "Error When Opening Input Accounts",
                                       "ERROR",
                                       JOptionPane.ERROR_MESSAGE);
      }
      
      //String temp = stdin.readLine();
      
      list.setListData(visualData);
   }//GEN-LAST:event_loadAccountsActionPerformed

   private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
      
      Account selected = (Account) list.getSelectedValue();

      try
      {
         String text = this.transactionAmount.getText();
         if(text.equals(""))
            text = "0";
         Double transactionAmount = Double.parseDouble(text);
         selected.credit(transactionAmount);
      }
      catch(java.lang.NumberFormatException e)
      {
         JOptionPane.showMessageDialog(new JFrame(),
                              "Incorrect Transaction Format",
                              "ERROR",
                              JOptionPane.ERROR_MESSAGE);
      }
      catch(NullPointerException e)
      {
         JOptionPane.showMessageDialog(new JFrame(),
                              "Please Select an Account",
                              "ERROR",
                              JOptionPane.ERROR_MESSAGE);
         
      }
      list.setListData(visualData);
      transactionAmount.setText(null);
   }//GEN-LAST:event_depositActionPerformed

   private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
      /*
      Object selected = list.getSelectedValue();
      String amount = JOptionPane.showInputDialog(selected);
      Double depositAmount = Double.parseDouble(amount);
      Account temp = (Account) selected;
      temp.debit(depositAmount);
      list.setListData(visualData);     
      */
      Account selected = (Account) list.getSelectedValue();

      try
      {
         String text = this.transactionAmount.getText();
         if(text.equals(""))
            text = "0";
         boolean mm = false;
         Double transactionAmount = Double.parseDouble(text);

         selected.debit(transactionAmount);
         if(list.getSelectedValue() instanceof MoneyMarket)
         {
            
         }
      }
      catch(java.lang.NumberFormatException e)
      {
         JOptionPane.showMessageDialog(new JFrame(),
                              "Incorrect Transaction Format",
                              "ERROR",
                              JOptionPane.ERROR_MESSAGE);
      }
      catch(NullPointerException e)
      {
         JOptionPane.showMessageDialog(new JFrame(),
                              "Please Select an Account",
                              "ERROR",
                              JOptionPane.ERROR_MESSAGE);
         
      }
      list.setListData(visualData);
      transactionAmount.setText(null);
   }//GEN-LAST:event_withdrawActionPerformed

   /**
    * clears all fields and prints current accounts
    * @param evt 
    */
   private void showAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAccountsActionPerformed
      data.compareDates(new Date(this.DateTextField.getText()));
   }//GEN-LAST:event_showAccountsActionPerformed

   private void runMonthlyInterestAndFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMonthlyInterestAndFeesActionPerformed
      data.runFeesAndInterest();
      list.setListData(visualData);
   }//GEN-LAST:event_runMonthlyInterestAndFeesActionPerformed
   
   /**
    * checks if the name is valid. it must be composed of just letters
    * and there must be a first and last name
    * @param name
    * @return if it is valid, false if not
    */
   private boolean nameIsValid(String name)
   {
      boolean result = name.matches("[a-zA-z]+ [a-zA-Z]+");
      return result;
   }
   
   /**
    * checks if the phone number is valid. it must have only numbers and
    * be 10 characters long
    * @param phone
    * @return true if it is valid, false if not
    */
   private boolean phoneIsValid(String phone)
   {
      // Regular expression that matches if phone is
      // 10 characters long and contains only numbers
      return phone.matches("[0-9]{7}");
   }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TransactionManager().setVisible(true);
                
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField DateTextField;
   private javax.swing.JTextField accountNumberField;
   private javax.swing.ButtonGroup accountTypeGroup;
   private javax.swing.JTextField balanceField;
   private javax.swing.JRadioButton checking;
   private javax.swing.JButton closeAccount;
   private javax.swing.JTextField dateOpenedField;
   private javax.swing.JButton deposit;
   private javax.swing.JCheckBox directDeposit;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JRadioButton jRadioButton4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JList list;
   private javax.swing.JButton loadAccounts;
   private javax.swing.JRadioButton moneyMarket;
   private javax.swing.JTextField nameField;
   private javax.swing.JButton openAccount;
   private javax.swing.JTextField phoneNumberField;
   private javax.swing.JButton runMonthlyInterestAndFees;
   private javax.swing.JRadioButton savings;
   private javax.swing.JPopupMenu searchOption;
   private javax.swing.JButton showAccounts;
   private javax.swing.JCheckBox specialSavingsAccount;
   private javax.swing.JTextArea statisticsArea;
   private javax.swing.JTextField transactionAmount;
   private javax.swing.JButton withdraw;
   // End of variables declaration//GEN-END:variables
}
