import java.lang.reflect.Array;
import java.util.ArrayList;



public class Server {

    public boolean toRefresh = false;

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
        refresh();
        
    }
    public ArrayList<Com> getComs() {
        return coms;
    }
    public void refresh() {
        toRefresh = true;
    }
}
