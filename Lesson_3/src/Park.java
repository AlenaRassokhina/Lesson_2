import java.util.ArrayList;
import java.util.List;

public class Park {
    public static class Attraction {
        private String name;
        private String openTime;
        private String closeTime;
        private double price;

        public Attraction(String name, String openTime, String closeTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name +
                    ", Время работы: " + openTime + " - " + closeTime +
                    ", Стоимость: " + price + " руб.";
        }
    }

    private String parkName;
    private List<Attraction> attractions;
    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public void displayAttractions() {
        System.out.println("Аттракционы в парке \"" + parkName + "\":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }
}
