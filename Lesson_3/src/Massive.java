import java.util.Arrays;

public class Massive {
    String name;
    String date;
    String factory;
    String country;
    int price;
    boolean status;
    public Massive(String name, String date, String factory, String country, int price, boolean status) {
        this.name = name;
        this.date = date;
        this.factory = factory;
        this.country = country;
        this.price = price;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Товар{" +
                "название='" + name + '\'' +
                ", дата производства='" + date + '\'' +
                ", производитель='" + factory + '\'' +
                ", страна происхождения='" + country + '\'' +
                ", цена='" + price + '\'' +
                ", состояние='" + status + '\'' +
                '}';
    }
}

