public class Com {

    private String name;
    private String comunicate;
   
    public Com(String name, String comunicate) {
        this.name = name;
        this.comunicate = comunicate;
    }

    public String toString() {
        return name + " -> " + comunicate;
    }

    public void recieve() {
        System.out.println(this);
    }
}
