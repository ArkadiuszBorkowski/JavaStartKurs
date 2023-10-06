package Package.data;

public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;

    // konstruktor1
    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    // konstruktor2
    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}