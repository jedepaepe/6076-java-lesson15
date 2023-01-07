import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private String plaque;
    private String color;
    private double buyPrice;
    private int constructionYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getAge() {
        return Year.now().getValue() - constructionYear;
    }

    public double getCurrentPrice() {
        double price = buyPrice * (1 - getAge() * 0.10);
        return price > 0 ? price : 0;
    }

    public boolean equals(Car other) {
        return plaque.equals(other.plaque);
    }
}
