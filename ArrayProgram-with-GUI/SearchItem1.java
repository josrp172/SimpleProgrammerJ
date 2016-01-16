import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;


public class SearchItem1 extends JFrame
{
    private JLabel lblSearchItem;
    private JLabel lblSearchIndex;
   private JLabel lblDisplayItem;
   private JLabel lblSearchPiece;
   private JButton btnOk;
        
    
    public SearchItem1(){
        
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(0,1));
        
        JPanel below = new JPanel();
        below.setLayout(new GridLayout(0,1));
        
         JPanel aFlowPanel = new JPanel();
        aFlowPanel.setLayout(new GridLayout(1 ,1,10,20));
        
        JPanel bFlowPanel = new JPanel();
        bFlowPanel.setLayout(new GridLayout(1, 1,10,20));
        
        JPanel cFlowPanel = new JPanel();
        cFlowPanel.setLayout(new GridLayout(1, 1,10,20 ));
       
         
         JPanel frame = new JPanel();
        frame.setLayout(new GridLayout(0,3,5,5));
        

        lblDisplayItem = new JLabel("Found at:", JLabel.CENTER);
        lblDisplayItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
        top.add(lblDisplayItem);
        
         
           lblSearchIndex = new JLabel(""+(SearchItem.searchIndex+1) , JLabel.CENTER);
         lblSearchIndex.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
         aFlowPanel.add(lblSearchIndex);
         lblSearchItem = new JLabel(""+SearchItem.searchItems, JLabel.CENTER);
          lblSearchItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
          bFlowPanel.add(lblSearchItem);
          lblSearchPiece = new JLabel(""+SearchItem.searchPiece , JLabel.CENTER);
          lblSearchPiece.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
          cFlowPanel.add(lblSearchPiece);
          
           
        
        
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
        
       

        
        
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // outer border
    Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();      // inner border
    Border compoundBorder =  BorderFactory.createCompoundBorder(emptyBorder,loweredBevelBorder);
   
    
    TitledBorder atitled = new TitledBorder(compoundBorder, "Item number"); //sets the title border
   aFlowPanel.setBorder(atitled);
   TitledBorder btitled = new TitledBorder(compoundBorder, "Item"); //sets the title border
   bFlowPanel.setBorder(btitled);
   TitledBorder ctitled = new TitledBorder(compoundBorder, "Pieces"); //sets the title border
   cFlowPanel.setBorder(ctitled);
   
     
        JScrollPane pane1 = new JScrollPane(frame); 
        add(pane1);
        pane1.setLayout(new ScrollPaneLayout());  
        

    setSize(1000,300);

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

