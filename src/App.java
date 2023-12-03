import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {
        
        Server s1 = new Server("WIPIE 1");
        Server s2 = new Server("WIPIE 2");
        Server s3 = new Server("WIPIE 3");
    
        //Client c1 = new Client(s1, "Jorge");
        //Client c2 = new Client(s1, "Luis");
//
        //c1.send("Hola");
        //c2.send("Hola");

        //Test t1 = new Test();
        //t1.p2.add(new JLabel("Holaaa"));
        //t1.addLabel();

        LoginWindow lw = new LoginWindow(s1, s2, s3);
        LoginWindow l2 = new LoginWindow(s1, s2, s3);
    }
}
