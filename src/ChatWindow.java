import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;

public class ChatWindow {

    
    public JFrame frame;
    public JPanel panel;
    public JPanel panel2;

    public JLabel label;
    public JLabel label2;

    public JTextArea textArea;
    public JPanel p2;
    public JTextField textField;

    private Client client;
    private Server clientServer;


    public ChatWindow(Client client, Server clientServer) {

        this.client = client;
        this.clientServer = clientServer;
        


        
        frame = new JFrame("Test");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(500, 500);
        

       

        

      
        

     

        p2 = new JPanel();
        p2.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder()));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setPreferredSize(new Dimension(500, 300));
        p2.setMaximumSize(new Dimension(500, 300));
        p2.setMinimumSize(new Dimension(500, 300));
        

        frame.add(p2);
        
        JButton button = new JButton("Wyślij");
        textField = new JTextField(10);
        
        textField.setAlignmentX(0);
        textField.setAlignmentY(0);
        textField.setMaximumSize(new Dimension(500, 50));
        textField.setMinimumSize(new Dimension(500, 50));
        textField.setPreferredSize(new Dimension(500, 50));

        frame.add(textField);

        
        
        
        button.addActionListener(e -> {



            String text = textField.getText();

            ArrayList<Com> coms = clientServer.getComs();

            int comsLength = coms.size();

            JLabel label3 = new JLabel(text);

            client.send(text);
            p2.removeAll();

            for (Com com : coms) {
                p2.setVisible(false);
                p2.add(new JLabel(com.toString()));
                p2.setVisible(true);
            }

            //p2.setVisible(false);
            //p2.add(label3);
            //p2.setVisible(true);
        });
               
           

            


            
           

            
            
            
            
           
            
       


        frame.add(button);
        

        frame.setVisible(true);
    
    }
}