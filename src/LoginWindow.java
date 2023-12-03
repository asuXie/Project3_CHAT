import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.*;

public class LoginWindow {

    JFrame frame;
    JTextField nickname;
    JCheckBox serverChoosen [] = new JCheckBox[3];
    JPanel panel;
    JButton login;
    Server s1;
    Server s2;
    Server s3;

    

    public LoginWindow() {


        Server s1 = new Server("WIPIE 1");
        Server s2 = new Server("WIPIE 2");
        Server s3 = new Server("WIPIE 3");

        frame = new JFrame("Login");
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        
        panel = new JPanel();
        //----Lista Serwerów---//

        for (int i = 0; i < 3; i++) {
            serverChoosen[i] = new JCheckBox("WIPIE " + (i+1));
            panel.add(serverChoosen[i]);
            serverChoosen[i].setVisible(true);
            
            serverChoosen[i].setFocusable(false);
        }

        //----Nickname---//
        nickname = new JTextField(10);
        nickname.setAlignmentX(0);
        nickname.setAlignmentY(100);
        panel.add(nickname);

        //----Login---//
        login = new JButton("Login");
        login.addActionListener(e -> {
            String nick = nickname.getText();
            System.out.println(nick);
            int flag = 0;
            int selected = 0;
            for (int i = 0; i < 3; i++) {
                if (serverChoosen[i].isSelected()) {
                    flag++;
                    selected = i;
                    

                }
                if (flag > 1) {
                    JOptionPane.showMessageDialog(frame, "Wybierz jeden serwer");
                    break;
                }
                
                
            }
            if (flag == 1) {

                    switch(selected) {
                        case 0:
                            System.out.println("WYBRANO SERWER 1");
                            setServer(s1, nick);
                            break;
                        case 1:
                            System.out.println("WYBRANO SERWER 2");
                            setServer(s2, nick);
                            break;
                        case 2:
                            System.out.println("WYBRANO SERWER 3");
                            setServer(s3, nick);
                            break;
                    }
                    
                }
        });
        panel.add(login);

        


        
        
        
        
        frame.add(panel);

        

        panel.setVisible(true);
        frame.setVisible(true);

        


        

        
    }

    public void setServer(Server server, String nick) {
        frame.dispose();
        Client client = new Client(server, nick);
        
    }

    
}
