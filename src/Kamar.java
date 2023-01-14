public class Kamar extends Chair {
    
    public Kamar(String name, String color, int price) {
        super(name, color, price);
        //TODO Auto-generated constructor stub
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type + this.getName();
    }
}
