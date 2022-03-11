package Kolekcje;

public class Car {
    private int year;
    private String color;
    private String producent;


    public Car(int year, String color, String producent){
        this.year = year;
        this.color = color;
        this.producent = producent;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getProducent() {
        return producent;
    }


}
