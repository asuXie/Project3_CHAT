public class App {
    public static void main(String[] args) throws Exception {
        
        Server s1 = new Server();
        Client c1 = new Client(s1, "Jorge");
        Client c2 = new Client(s1, "Luis");

        c1.send("Hola");
        c2.send("Hola");
    }
}
