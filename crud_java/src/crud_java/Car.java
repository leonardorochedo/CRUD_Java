package crud_java;

/**
 *
 * @author Leonardo Rochedo
 */
public class Car {
    // Definindo o tipo dos dados
    private int id;
    private String model;
    private int year;
    private double price;
    
    // Metodos construtores
    public Car() {
        
    }
    
    public Car(int id, String model, int year, double price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", year=" + year + ", price=" + price + '}';
    }
    
}
