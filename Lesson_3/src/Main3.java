public class Main3 {
    public static void main(String[] args) {
        //task 1
        Product product1 = new Product(
                "Велосипед",
                "2025/11/21",
                "Sport Master",
                "China",
                25000,
                true);
        System.out.println(
                "название: " + product1.name +
                ", дата производства: " + product1.productionDate +
                ", производитель: " + product1.manufacturer +
                ", страна происхождения: " + product1.countryOfOrigin +
                ", цена: " + product1.price +
                ", состояние бронирования покупателем: " + product1.bookingStatus);
        //task 2
        Massive[] productsArray  = new Massive[5];

        productsArray [0] = new Massive("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray [1] = new Massive("Quarterly calendar", "22.11.2024", "Hatber", "Russia", 100, true);
        productsArray [2] = new Massive("HONOR X7d", "15.01.2024", "HONOR Corp.", "China", 10137, true);
        productsArray [3] = new Massive("POCO C71", "05.09.2025", "Xiaomi Corp.", "China", 5570, true);
        productsArray [4] = new Massive("A6 Pro", "12.10.2025", "OPPO Corp.", "China", 22440, true);

        System.out.println("Вывод через цикл:");
        for (int i = 0; i < productsArray .length; i++) {
            System.out.println(productsArray [i]);
        }
        //task 3
        Park myPark = new Park("Остров мечты");

        Park.Attraction towerOfGargamel = new Park.Attraction("Башня Гаргамеля", "9:00", "21:00", 300.0);
        Park.Attraction hammer = new Park.Attraction("Молот", "09:00", "21:00", 250.0);
        Park.Attraction smurfsVillage = new Park.Attraction("Деревня смурфиков", "9:00", "21:00", 350.0);

        myPark.addAttraction(towerOfGargamel);
        myPark.addAttraction(hammer);
        myPark.addAttraction(smurfsVillage);

        myPark.displayAttractions();
    }
}