import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;


public class DisplayItem extends JFrame{
    private JLabel lblDisplayItem;
    private JLabel lblListItem;
    private JLabel lblNumber;
    private JLabel lblPieces;
    
     private JLabel[] lblArrayListItem = new JLabel[CreateAccount.limit+GuiForm.officialCount];
     private JLabel[] lblArrayPieces = new JLabel[CreateAccount.limit+GuiForm.officialCount];
     private JLabel[] lblArrayNumber = new JLabel[CreateAccount.limit+GuiForm.officialCount];
     private JLabel[] lblArrayLine = new JLabel[CreateAccount.limit+GuiForm.officialCount];
     private JButton btnOk;
        
    
    public DisplayItem(){
        
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(0,1));
             
        
        JPanel below = new JPanel();
        below.setLayout(new GridLayout(0,1));
        
         JPanel aFlowPanel = new JPanel();
        aFlowPanel.setLayout(new GridLayout(GuiForm.officialCount ,1,10,20));
        
        
        JPanel bFlowPanel = new JPanel();
        bFlowPanel.setLayout(new GridLayout(GuiForm.officialCount, 1,10,20));
        
        JPanel cFlowPanel = new JPanel();
        cFlowPanel.setLayout(new GridLayout(GuiForm.officialCount, 1,10,20 ));
       
         
         JPanel frame = new JPanel();
        frame.setLayout(new GridLayout(0,3,5,5));
       
        lblDisplayItem = new JLabel("Display all Items", JLabel.CENTER);
         lblDisplayItem.setFont(new Font("Courier New Bold", Font.PLAIN, 27));

        top.add(lblDisplayItem);
        lblDisplayItem.setForeground(Color.RED);
        
       for(int index = 0; index < GuiForm.officialCount; index++){

                   
           lblArrayNumber[index] = new JLabel(""+(index+1) , JLabel.CENTER);
               lblArrayNumber[index].setFont(new Font("Courier New Bold", Font.PLAIN, 20));
         aFlowPanel.add(lblArrayNumber[index]);
        
         lblArrayListItem[index] = new JLabel(""+GuiForm.item.get(index), JLabel.CENTER);
               lblArrayListItem[index].setFont(new Font("Courier New Bold", Font.PLAIN, 20));
          bFlowPanel.add(lblArrayListItem[index]);
      
          lblArrayPieces[index] = new JLabel(""+GuiForm.piece[index] , JLabel.CENTER);
               lblArrayPieces[index].setFont(new Font("Courier New Bold", Font.PLAIN, 20));
          cFlowPanel.add(lblArrayPieces[index]);
          
          
          
          lblArrayNumber[index].setPreferredSize(new Dimension(lblArrayNumber[index].getWidth(), 50 ));
             lblArrayNumber[index].setPreferredSize(new Dimension(lblArrayNumber[index].getHeight(),50));
           
        }
        
         btnOk = new JButton("Ok");
       btnOk.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
       btnOk.addActionListener(new btnOkAction());
      below.add(btnOk);
       
       
        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        frame.add(aFlowPanel, BorderLayout.WEST);
        frame.add(bFlowPanel, BorderLayout.CENTER);
        frame.add(cFlowPanel, BorderLayout.EAST);
        add(below, BorderLayout.SOUTH);
        //add(JButtons, BorderLayout.SOUTH);
        
       

        
        JScrollPane pane1 = new JScrollPane(frame); 
        add(pane1);
        pane1.setLayout(new ScrollPaneLayout());  
        
        
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // outer border
    Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();      // inner border
    Border compoundBorder =  BorderFactory.createCompoundBorder(emptyBorder,loweredBevelBorder);
   
    
    TitledBorder atitled = new TitledBorder(compoundBorder, "Item number"); //sets the title border
   aFlowPanel.setBorder(atitled);

   TitledBorder btitled = new TitledBorder(compoundBorder, "Item"); //sets the title border
   bFlowPanel.setBorder(btitled);
   TitledBorder ctitled = new TitledBorder(compoundBorder, "Pieces"); //sets the title border
   cFlowPanel.setBorder(ctitled);
   
     
        
   
        
        setTitle("ADD ITEM");
         if(GuiForm.officialCount >= 4){
    setSize(1000, 700);
}
    else if(GuiForm.officialCount  <= 3){
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
            
            new Choice();
            setVisible(false);
        }
    }
}
