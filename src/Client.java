public class Client {

    private Server server;
    private String nick;

    public Client(Server server, String nick) {
        this.server = server;
        this.nick = nick;
    }

    public Client(Server server) {
        this(server, "Anonymous");
    }

    public void send(String comunicate) {
        Com com = new Com(nick, comunicate);
        server.recieveCom(com);
    } 
    
}
