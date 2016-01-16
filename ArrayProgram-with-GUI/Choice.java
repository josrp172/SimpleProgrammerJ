
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Choice extends JFrame
{
  
 private JButton studentNameDatabase;
 private JButton btnAddItem;
 private JButton btnRemoveItem;
 private JButton btnUpdateItem;
 private JButton btnDisplayItem;
 private JButton btnSearchItem;
 private JButton btnExit;
 
 private ImageIcon iiCreateAccount;
    private ImageIcon iiDeleteAccount;
    private ImageIcon iiChangePassword;
    private ImageIcon iiAccountInformation;
    private ImageIcon iiWithdraw;
    private ImageIcon iiDeposit;
    private ImageIcon iiExit;
 
 

 
 private static int userChoice;
 
 private JPanel x;
 private JPanel y;
 
 private JButton enter;
 
 public Choice()
 {
    JPanel aFlowPanel = new JPanel();
       aFlowPanel.setLayout(new GridLayout(6,0,2,2));
       
       setLayout(new BorderLayout());
      
       aFlowPanel.setBackground(Color.CYAN);
       aFlowPanel.setPreferredSize(new Dimension(900,500));
       
       
      // setLayout
        add(aFlowPanel, BorderLayout.CENTER);
       
     iiCreateAccount = new ImageIcon("C:/Users/Joseph_17/Documents/Java/plus-icon.png"); //it sets an icon within the JButton
       btnAddItem = new JButton("ADD", iiCreateAccount);
       btnAddItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnAddItem.setToolTipText("add an Item");//adding tool tips in a component
       

       aFlowPanel.add(btnAddItem);
       btnAddItem.addActionListener(new btnAddItemAction()); //add actions or specific tasks
       
      //Delete an account
       iiDeleteAccount = new ImageIcon("C:/Users/Joseph_17/Documents/Java/Actions-user-group-delete-icon.png");
       btnRemoveItem = new JButton("REMOVE", iiDeleteAccount);
       btnRemoveItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnRemoveItem.setToolTipText("Removes an Item");
      
      
       aFlowPanel.add(btnRemoveItem);
       btnRemoveItem.addActionListener(new btnRemoveItemAction());
       
       //Change account's password
       iiChangePassword = new ImageIcon("C:/Users/Joseph_17/Documents/Java/change-password-icon.png");
      btnUpdateItem = new JButton("UPDATE", iiChangePassword);
       btnUpdateItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnUpdateItem.setToolTipText("Updates an Item");
       aFlowPanel.add(btnUpdateItem);
       btnUpdateItem.addActionListener(new btnUpdateItemAction());
       
       //Account information
       iiAccountInformation = new ImageIcon("C:/Users/Joseph_17/Documents/Java/personal-information-icon.png");
       btnDisplayItem = new JButton("DISPLAY", iiAccountInformation);
       btnDisplayItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnDisplayItem.setToolTipText("display all the items");
       aFlowPanel.add(btnDisplayItem);
       btnDisplayItem.addActionListener(new btnDisplayItemAction());
       
       
       
      
       btnSearchItem = new JButton("SEARCH" );
       btnSearchItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnSearchItem.setToolTipText("Search an Item");
       aFlowPanel.add(btnSearchItem);
       btnSearchItem.addActionListener(new btnSearchItemAction());
       
       iiExit = new ImageIcon("C:/Users/Joseph_17/Documents/Java/Delete-icon.png");
       btnSearchItem = new JButton("EXIT", iiExit);
       btnSearchItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
       btnSearchItem.setToolTipText("System Exit");
       aFlowPanel.add(btnSearchItem);
       btnSearchItem.addActionListener(new btnExitAction());
         

       setTitle("Items");
       setSize(500,370);
       setVisible(true);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null); //make it appear on the center of the screen
   
    
    add(aFlowPanel);
   
    
    setTitle("Item Database");
    setSize(600, 400);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
} 


private class btnAddItemAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            new CreateAccount();
            
            
        }
    }

private class btnRemoveItemAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            
            new GuiDelete();
            setVisible(false);
        }
    }
    
    private class btnUpdateItemAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            new UpdateItem();
            setVisible(false);
        }
    }
    
    private class btnDisplayItemAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
           new DisplayItem();
           setVisible(false);
        }
    }
    
    private class btnSearchItemAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
           new SearchItem();
           setVisible(false);
        }
    }
    
    private class btnExitAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            
            //new Exit();
            new EXIT();
            
            setVisible(false);
        }
    }



   



}

