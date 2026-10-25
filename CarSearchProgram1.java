import java.util.Scanner;
class Car {

    // Instance variables
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display car details
    void display() {
        System.out.printf(
            "Brand: %-8s Model: %-12s Price: Rs. %.2f%n",
            brand,
            model,
            price
        );
    }
}

public class CarSearchProgram1 {

    public static void main(String[] args) {

        // Array of 15 brands
        String[] brands = {
            "Ford",
            "Maruti",
            "Tata",
            "Hyundai",
            "Nissan",
            "BMW",
            "Ford",
            "Maruti",
            "Tata",
            "Hyundai",
            "Nissan",
            "BMW",
            "Ford",
            "Maruti",
            "Tata"
        };

        // Array of 15 models
        String[] models = {
            "EcoSport",
            "Swift",
            "Nexon",
            "Creta",
            "Magnite",
            "X1",
            "Endeavour",
            "Baleno",
            "Harrier",
            "Venue",
            "Kicks",
            "X5",
            "Mustang",
            "Brezza",
            "Punch"
        };

        // Array of 15 prices
        double[] prices = {
            120000,
            80000,
            140000,
            180000,
            100000,
            500000,
            360000,
            910000,
            200000,
            100000,
            100000,
            950000,
            800000,
            120000,
            750000
        };

        // Step 1: Declare an array reference
        Car[] cars;

        // Step 2: Create an array for 15 Car references
        cars = new Car[15];

        // Step 3: Create 15 Car objects
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                brands[i],
                models[i],
                prices[i]
            );
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available brands:");
        System.out.println(
            "Ford, Maruti, Tata, Hyundai, Nissan, BMW"
        );

        // Ask the user to enter a brand
        System.out.print("\nEnter the car brand: ");
        String searchBrand = scanner.nextLine();

        double totalPrice = 0;
        int carCount = 0;

        System.out.println("\nMatching cars:");
        System.out.println(
            "------------------------------------------------"
        );

        // Search for the entered brand
        for (Car car : cars) {

            if (car.brand.equalsIgnoreCase(searchBrand)) {

                car.display();

                // Add the price of matching cars
                totalPrice = totalPrice + car.price;

                // Count matching cars
                carCount++;
            }
        }

        System.out.println(
            "------------------------------------------------"
        );

        // Display result
        if (carCount > 0) {

            System.out.println(
                "Number of " + searchBrand +
                " cars: " + carCount
            );

            System.out.printf(
                "Total price of all %s cars: Rs. %.2f%n",
                searchBrand,
                totalPrice
            );

        } else {

            System.out.println(
                "No car found for brand: " + searchBrand
            );
        }

        scanner.close();
    }
}