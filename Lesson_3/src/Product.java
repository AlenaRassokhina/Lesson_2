
public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String countryOfOrigin;
    int price;
    boolean bookingStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, int price, boolean bookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }
}
