import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;


public class SearchItem extends JFrame
{
    public static int searchIndex = 0;
    public static String searchItems;
    public static int searchPiece = 0;
    
    private JLabel lblSearchItem;
    private JTextField txtSearchItem;
    
    
    private JButton btnOk;
    private JButton btnClear;
    private JButton btnBack;
    
    
    public SearchItem(){
       
       
       JPanel aFlowPanel = new JPanel();
       aFlowPanel.setLayout(new GridLayout(0,2,0,5));
       aFlowPanel.setOpaque(false);
       Border bAFlowPanel = BorderFactory.createLoweredBevelBorder();
       TitledBorder title = new TitledBorder(bAFlowPanel, "Change Item");
       aFlowPanel.setBorder(title);
       
       setLayout(new BorderLayout(0,5));
       add(aFlowPanel, BorderLayout.CENTER);

       JPanel C = new JPanel();
       C.setLayout(new GridLayout(0,3));
       add(C, BorderLayout.SOUTH);
       C.setPreferredSize(new Dimension(C.getWidth(), 50));
       
       
       
       lblSearchItem = new JLabel("Name of the item to be search", JLabel.CENTER);
                lblSearchItem.setFont(new Font("Courier New", Font.PLAIN, 20));
       aFlowPanel.add(lblSearchItem);
       txtSearchItem = new JTextField(20);
       txtSearchItem.setHorizontalAlignment(JTextField.CENTER);
       aFlowPanel.add(txtSearchItem);
       
    
       
       
       btnOk = new JButton("Ok");
       C.add(btnOk);
       btnOk.addActionListener(new btnOkAction());
       
       btnClear = new JButton("Clear");
       C.add(btnClear);
       btnClear.addActionListener(new btnClearAction());
       
       btnBack = new JButton("Back");
       C.add(btnBack);
       btnBack.addActionListener(new btnBackAction()); 
       
       
       
       
       setTitle("Search an Item");
      
       setSize(1000,250);
       setVisible(true);
       setLocationRelativeTo(null);
        
    }
    
    private class btnOkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        { 
      try{
          String searchItem = txtSearchItem.getText();
          for(int index = 0; index < GuiForm.officialCount; index++){
              if(searchItem.equals(GuiForm.item.get(index))){
                  searchIndex = index;
                   searchPiece = GuiForm.piece[index];
                   searchItems = searchItem;
                  index = GuiForm.officialCount;
                  new SearchItem1();
                  setVisible(false);
                }
                else if(index == (GuiForm.officialCount-1) && !(searchItem.equals(GuiForm.item.get(index)))){
                    JOptionPane.showMessageDialog(null, "Item not existing");
                    new Choice();
                    setVisible(false);
                }
            }
          
          
          
          
             
        }catch(NumberFormatException x){
            JOptionPane.showMessageDialog(null, "Wrong Input");
        }
        catch(ArrayIndexOutOfBoundsException x){
            JOptionPane.showMessageDialog(null, "No record");
        }
            
    }
    }

     private class btnClearAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            txtSearchItem.setText("");
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
