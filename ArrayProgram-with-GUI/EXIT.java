import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EXIT extends JFrame{
    private JLabel lblExit;
    private JButton btnYes;
    private JButton btnNo;
    
   public EXIT(){
       setLayout(new BorderLayout());
       
       JPanel aFlowPanels = new JPanel();
       aFlowPanels.setLayout(new GridLayout(1,0));
       add(aFlowPanels, BorderLayout.CENTER);
       lblExit = new JLabel("Are you sure you want to exit?", JLabel.CENTER);
       lblExit.setFont(new java.awt.Font("Arial",Font.BOLD,14));  //setting up the font
       aFlowPanels.add(lblExit);
       
      JPanel aFlowPanel = new JPanel();
      aFlowPanel.setLayout(new GridLayout(0,2,5,5));
      add(aFlowPanel, BorderLayout.SOUTH);
      aFlowPanel.setPreferredSize(new Dimension(50,50));
      
       btnYes = new JButton("Yes");
       aFlowPanel.add(btnYes);
       btnYes.addActionListener(new btnYesAction());
       
       btnNo = new JButton("No"); 
       aFlowPanel.add(btnNo);
       btnNo.addActionListener(new btnNoAction());
       
       setTitle("Exit");
       setSize(500,200);
       setVisible(true);
       setLocationRelativeTo(null);
   }

   private class btnYesAction implements ActionListener{
       public void actionPerformed(ActionEvent ae){
           System.exit(0);
       }
    }
    
   private class btnNoAction implements ActionListener{
       public void actionPerformed(ActionEvent ae){
           new Choice();
           setVisible(false);
           
       }
    }

}
