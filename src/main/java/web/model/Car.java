package web.model;

public class Car {
    String producer;
    String color;
    int  series;

    public Car(String producer, String color, int series) {
        this.producer = producer;
        this.color = color;
        this.series = series;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
