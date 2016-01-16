import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;


public class UpdateItem extends JFrame
{
    private JLabel lblUpdateItem;
    private JLabel lblUpdateTo;
    private JLabel lblPieces;
    private JLabel lblChangePieces;
    private JTextField txtUpdateItem;
    private JTextField txtUpdateTo;
    
    private JTextField txtChangePieces;
    private JButton btnOk;
    private JButton btnClear;
    private JButton btnBack;
    
    
    public UpdateItem(){
       
       
       JPanel aFlowPanel = new JPanel();
       aFlowPanel.setLayout(new GridLayout(0,2,0,5));
       aFlowPanel.setOpaque(false);
       Border bAFlowPanel = BorderFactory.createLoweredBevelBorder();
       TitledBorder title = new TitledBorder(bAFlowPanel, "Change Item");
       aFlowPanel.setBorder(title);
       
       JPanel bFlowPanel = new JPanel();
       bFlowPanel.setLayout(new GridLayout(0,2,0,5));
       bFlowPanel.setOpaque(false);
       Border cAFlowPanel = BorderFactory.createLoweredBevelBorder();
       TitledBorder titled = new TitledBorder(cAFlowPanel, "Change no. of pieces");
       bFlowPanel.setBorder(titled);

       setLayout(new BorderLayout(0,5));
       add(aFlowPanel, BorderLayout.CENTER);
       
     
       
       add(bFlowPanel, BorderLayout.EAST);
       
       
       
       
       JPanel C = new JPanel();
       C.setLayout(new GridLayout(0,3));
       add(C, BorderLayout.SOUTH);
       C.setPreferredSize(new Dimension(C.getWidth(), 50));
       
       
       
       lblUpdateItem = new JLabel("Name of the item to be updated: ", JLabel.CENTER);
       aFlowPanel.add(lblUpdateItem);
       lblUpdateItem.setFont(new Font("Courier New Bold", Font.PLAIN, 14));
       txtUpdateItem = new JTextField(20);
       txtUpdateItem.setHorizontalAlignment(JTextField.CENTER);
       aFlowPanel.add(txtUpdateItem);
       
       lblUpdateTo = new JLabel("Update item to:", JLabel.CENTER);
       aFlowPanel.add(lblUpdateTo);
       lblUpdateTo.setFont(new Font("Courier New Bold", Font.PLAIN, 14));
       txtUpdateTo = new JTextField(20);
       txtUpdateTo.setHorizontalAlignment(JTextField.CENTER);
       aFlowPanel.add(txtUpdateTo);
       
       
       
       lblChangePieces = new JLabel("Change no. of pieces to: ", JLabel.CENTER);
       bFlowPanel.add(lblChangePieces);
              lblChangePieces.setFont(new Font("Courier New Bold", Font.PLAIN, 14));
       txtChangePieces = new JTextField(20);
       txtChangePieces.setHorizontalAlignment(JTextField.CENTER);
       bFlowPanel.add(txtChangePieces);
       
       
       btnOk = new JButton("OK");
       C.add(btnOk);
       btnOk.addActionListener(new btnOkAction());
       
       btnClear = new JButton("Clear");
       C.add(btnClear);
       btnClear.addActionListener(new btnClearAction());
       
       btnBack = new JButton("Back");
       C.add(btnBack);
       btnBack.addActionListener(new btnBackAction()); 
       
       
       
       
       setTitle("Update an Item");
      
       setSize(1000,250);
       setVisible(true);
       setLocationRelativeTo(null);
        
    }
    
    private class btnOkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        { 
      try{
             String updateItem = txtUpdateItem.getText();
             String updateTo = txtUpdateTo.getText();
            
             
          
             int updatePiecesTo = Integer.parseInt(txtChangePieces.getText());
             
             for(int index = 0; index < GuiForm.officialCount; index++){
                 if(updateItem.equals(GuiForm.item.get(index))){
                     GuiForm.item.set(index, updateTo);
                     if(GuiForm.piece[index] > 5 || GuiForm.piece[index] < 10){
                        GuiForm.piece[index] = updatePiecesTo;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "the number of pieces must be less than 10 and less than 5");
              
                        }
                     
                    }
                }
         
         
              new Choice();
              setVisible(false);
      }catch(NumberFormatException x){
          JOptionPane.showMessageDialog(null, "Incorrect Input");
          new Choice();
          setVisible(false);
        }
            
    }
    }
    
    
    
     private class btnClearAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            txtUpdateItem.setText("");
            txtUpdateTo.setText("");
          
            
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
