package poly.bean;

public class Product {
    private String name;
    private double price;
    private String image;
    private String size;
    private String color;

    public Product(){}

    public Product(String name, double price, String image, String size, String color) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
