import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {

    public String serverName;
    
    private ArrayList<Com> coms;

    public Server(String serverName) {
        this.serverName = serverName;
        coms = new ArrayList<Com>();
    }
    
    private void saveCom(Com com) {
        coms.add(com);
    }   

    public void recieveCom(Com com){
        saveCom(com);
        System.out.println(com);
    }
    public ArrayList<Com> getComs() {
        return coms;
    }
}
