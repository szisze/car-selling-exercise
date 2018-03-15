package auto;

public abstract class Item {
    private double price;

    public abstract String getInformation();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
