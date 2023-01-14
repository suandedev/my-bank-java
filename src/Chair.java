public class Chair {
    
    // encapsulation
    private String name;
    private String color;
    private int price;

    // constructor
    public Chair(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void Sit() {
        System.out.println("Sitting on " + this.name);
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
