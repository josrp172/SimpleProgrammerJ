import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class GuiForm extends JFrame
{
    
    public static int officialCount = 0;;
    
    
    public static ArrayList item = new ArrayList();
       public static int[] piece = new int[100+officialCount];
    
    private JLabel[] lblItem = new JLabel[CreateAccount.limit+officialCount];
    private JLabel[] lblPieces = new JLabel[CreateAccount.limit+officialCount];
    private JLabel lblAddItem;
    
    private JTextField[] txtItem = new JTextField[CreateAccount.limit+officialCount];
    private JTextField[] txtPieces = new JTextField[CreateAccount.limit+officialCount];
    
    private JButton btnOk;
    private JButton btnBack;
    
    public GuiForm(){
        
   
         lblAddItem  = new JLabel("Add an Item ", JLabel.CENTER);
                    lblAddItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
                            lblAddItem.setForeground(Color.RED);
                    
        
        for(int index = (0+officialCount); index < (CreateAccount.limit+officialCount); index++){
            lblItem[index] = new JLabel("Item "+(index+1)+":  " ,JLabel.CENTER);
                 lblItem[index].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            lblPieces[index] = new JLabel("Pieces for Item "+(index+1)+":" ,JLabel.CENTER);
            lblPieces[index].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
            lblPieces[index].setPreferredSize(new Dimension(lblPieces[index].getWidth(), 20 ));
             lblPieces[index].setPreferredSize(new Dimension(lblPieces[index].getHeight(),20));
            
            txtItem[index] = new JTextField(10);
            txtItem[index].setHorizontalAlignment(JTextField.CENTER);
            txtPieces[index] = new JTextField(10);
            txtPieces[index].setHorizontalAlignment(JTextField.CENTER);
            txtPieces[index].setPreferredSize(new Dimension(txtPieces[index].getWidth(), 50 ));
             txtPieces[index].setPreferredSize(new Dimension(txtPieces[index].getHeight(),50));
        }
        JPanel s = new JPanel();
        s.setLayout(new GridLayout(0,2,0,0));
        JPanel v = new JPanel();
        v.setLayout(new GridLayout(CreateAccount.limit, 2, 10, 10));
             
        JPanel w = new JPanel();
             
                w.setLayout(new GridLayout(CreateAccount.limit, 2, 10, 10));
      JPanel x = new JPanel();
       x.setLayout(new GridLayout(0 , 1));
                x.add(lblAddItem);
        for(int index = (0+officialCount); index <(CreateAccount.limit+officialCount); index++){
            v.add(lblItem[index]);
            v.add(txtItem[index]);
            w.add(lblPieces[index]);
            w.add(txtPieces[index]);
        }
        
        JPanel JButtons = new JPanel();
        JButtons.setLayout(new GridLayout(0, 2, 10, 10));
        
       btnOk = new JButton("Ok");
       btnOk.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
       btnOk.addActionListener(new btnOkAction());
       JButtons.add(btnOk);
    
       btnBack = new JButton("Back");
       btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
       btnBack.addActionListener(new btnBackAction());
       JButtons.add(btnBack);
        
        setLayout(new BorderLayout());
        add(x, BorderLayout.NORTH);
        s.add(v, BorderLayout.CENTER);
        s.add(w, BorderLayout.EAST);
        add(JButtons, BorderLayout.SOUTH);
        
        JScrollPane pane = new JScrollPane(s); 
        add(pane);
        pane.setLayout(new ScrollPaneLayout());
        
        
      
     
      
        
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // outer border
    Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();      // inner border
    Border compoundBorder =  BorderFactory.createCompoundBorder(emptyBorder,loweredBevelBorder);
   
    
    TitledBorder titled = new TitledBorder(compoundBorder, "Item"); //sets the title border
   v.setBorder(titled);
   
    TitledBorder title = new TitledBorder(compoundBorder, "Pieces"); //sets the title border
   w.setBorder(title);
   
   
        
        
         setTitle("STUDENT NAME DATABASE");
         if(CreateAccount.limit >= 4){
    setSize(1000, 700);
}
else if(CreateAccount.limit  <= 3){
    setSize(1000,300);
}
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private class btnOkAction implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            try{

            for(int index = (0+officialCount); index < (CreateAccount.limit+officialCount); index++){
               
              item.add(txtItem[index].getText());
              piece[index] = Integer.parseInt(txtPieces[index].getText());
            
                   if(piece[index] < 5 || piece[index] > 10){
                    
                     
                    item.remove(index);
                    JOptionPane.showMessageDialog(null, "the number of pieces must be less than 10 and less than 5");
                   txtItem[index].setText("");
                   txtPieces[index].setText("");
                   
                
                }
        
    }
    
            officialCount+=CreateAccount.limit;
        
            
            new Choice();
            setVisible(false);
        }catch(NumberFormatException x){
            JOptionPane.showMessageDialog(null,"Wrong Input");
        }
        catch(ArrayIndexOutOfBoundsException x){
            JOptionPane.showMessageDialog(null, "index not found");
        }
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
