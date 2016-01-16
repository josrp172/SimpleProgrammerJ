import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;


public class GuiDelete extends JFrame{

    private JLabel lblDeleteItem;
    private JTextField txtDeleteItem;
  
    private JButton btnOk;
    private JButton btnClear;
    private JButton btnBack;
    
    //constructor
   public GuiDelete(){
       Image image = new javax.swing.ImageIcon("C:/Users/Joseph_17/Documents/Java/bank-folded-icons.png").getImage();
       setIconImage(image);
       
       JPanel aFlowPanel = new JPanel();
       aFlowPanel.setLayout(new GridLayout(0,2,0,5));
       aFlowPanel.setOpaque(false);
       Border bAFlowPanel = BorderFactory.createLoweredBevelBorder();
       TitledBorder title = new TitledBorder(bAFlowPanel, "Delete an Item");
       aFlowPanel.setBorder(title);

       setLayout(new BorderLayout(0,5));
       add(aFlowPanel, BorderLayout.CENTER);
       
       JPanel C = new JPanel();
       C.setLayout(new GridLayout(0,3));
       add(C, BorderLayout.SOUTH);
       C.setPreferredSize(new Dimension(C.getWidth(), 50));

       lblDeleteItem = new JLabel("Name of the item to be deleted: ", JLabel.CENTER);
       aFlowPanel.add(lblDeleteItem);
       txtDeleteItem = new JTextField(20);
       txtDeleteItem.setHorizontalAlignment(JTextField.CENTER);
       aFlowPanel.add(txtDeleteItem);

       btnOk = new JButton("Ok");
       C.add(btnOk);
       btnOk.addActionListener(new btnOkAction());
       
       btnClear = new JButton("Clear");
       C.add(btnClear);
       btnClear.addActionListener(new btnClearAction());
       
       btnBack = new JButton("Back");
       C.add(btnBack);
       btnBack.addActionListener(new btnBackAction()); 
       
       setTitle("Delete an Item");
       setSize(500,250);
       setVisible(true);
       setLocationRelativeTo(null);
       }
    
    
    private class btnOkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        { 
      try{
             String delete = txtDeleteItem.getText();
             
              for(int index = 0; index < GuiForm.officialCount; index++){
                  if(delete.equals(GuiForm.item.get(index))){
                  GuiForm.item.remove(delete);
                  CreateAccount.limit-=1;
                  for(int x = index+1; x <= GuiForm.officialCount; x++){
                      GuiForm.piece[x-1] = GuiForm.piece[x];
                    }
                    GuiForm.piece[GuiForm.officialCount - 1] = GuiForm.piece[GuiForm.officialCount-1];
                    GuiForm.officialCount-=1;
                  
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
    
    
    
     private class btnClearAction implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            txtDeleteItem.setText("");
        }
    }
    
     private class btnBackAction implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            
            new Choice();
            setVisible(false);
        }
    }
 
}

