package Map;

public class HistoryCar {
    private int yaers;
    private String model,color;
    private double price;

    public HistoryCar(int yaers, String model, String color, double price) {
        this.yaers = yaers;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public HistoryCar() {
    }

    public int getYaers() {
        return yaers;
    }

    public void setYaers(int yaers) {
        this.yaers = yaers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "historyCar{" +
                "yaers=" + yaers +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
