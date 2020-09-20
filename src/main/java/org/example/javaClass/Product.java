package org.example.javaClass;

public class Product {

    private int id;
    private String name;
    private String UPS;
    private String producer;
    private double price;
    private int storagePeriod;
    private int quantity;

    public Product(int id, String name, String UPS, String producer,
                   double price, int storagePeriod, int quantity) {
        this.id = id;
        this.name = name;
        this.UPS = UPS;
        this.producer = producer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPS() {
        return UPS;
    }

    public void setUPS(String UPS) {
        this.UPS = UPS;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(int storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPS='" + UPS + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", storagePeriod=" + storagePeriod +
                ", quantity=" + quantity +
                '}';
    }
}
