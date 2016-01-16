import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

import java.util.Arrays;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CreateAccount extends JFrame{

    public static int limit;
    private JLabel lblItemLimit;
    private JLabel lblPiecesLimit;
    
    private JTextField txtItemLimit;
    
    private JButton btnOk;
    private JButton btnClear;
    private JButton btnBack;
    
    //constructor
   public CreateAccount()
   {
       
       Image image = new javax.swing.ImageIcon("C:/Users/Joseph_17/Documents/Java/bank-folded-icons.png").getImage();
       setIconImage(image);
       
       JPanel aFlowPanel = new JPanel();
       aFlowPanel.setLayout(new GridLayout(0,2,0,5));
       aFlowPanel.setOpaque(false);
       Border bAFlowPanel = BorderFactory.createLoweredBevelBorder();
       TitledBorder title = new TitledBorder(bAFlowPanel, "How many Items");
       aFlowPanel.setBorder(title);

       setLayout(new BorderLayout(0,5));
       add(aFlowPanel, BorderLayout.CENTER);
       
       JPanel C = new JPanel();
       C.setLayout(new GridLayout(0,3));
       add(C, BorderLayout.SOUTH);
       C.setPreferredSize(new Dimension(C.getWidth(), 50));
       
       
       
       lblItemLimit = new JLabel("Enter how many Items", JLabel.CENTER);
       aFlowPanel.add(lblItemLimit);
       txtItemLimit = new JTextField(20);
       txtItemLimit.setHorizontalAlignment(JTextField.CENTER);
       aFlowPanel.add(txtItemLimit);
       

       btnOk = new JButton("Ok");
       C.add(btnOk);
       btnOk.addActionListener(new btnOkAction());
       
       btnClear = new JButton("Clear");
       C.add(btnClear);
       btnClear.addActionListener(new btnClearAction());
       
       btnBack = new JButton("Back");
       C.add(btnBack);
       btnBack.addActionListener(new btnBackAction()); 
       
       
       
       
       setTitle("Create an account");
      
       setSize(500,250);
       setVisible(true);
       setLocationRelativeTo(null);
       
       
       
       }
    
    
    private class btnOkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        { 
      try{
      limit = Integer.parseInt(txtItemLimit.getText());
         
         
              new GuiForm();
              setVisible(false);
      
             
      }catch(NumberFormatException x){
          JOptionPane.showMessageDialog(null, "Incorrect Input");
          new CreateAccount();
          setVisible(false);
        }
            
    }
    }
    
    
    
     private class btnClearAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            txtItemLimit.setText("");
            
        }
    }
    
     private class btnBackAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            
            new Choice();
            setVisible(false);
        }
    }
    
    
    
}

