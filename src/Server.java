import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {
    
    private ArrayList<Com> coms;

    public Server() {
        coms = new ArrayList<Com>();
    }
    
    private void saveCom(Com com) {
        coms.add(com);
    }   

    public void recieveCom(Com com){
        saveCom(com);
        System.out.println(com);
    }
}
