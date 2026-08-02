import java.util.*;

public class Restaurant {

    public static int billCounter(int q, int it) {
        int sum = 0;

        switch (it) {
            case 1:
                sum = q * 70;
                break;
            case 2:
                sum = q * 120;
                break;
            case 3:
                sum = q * 110;
                break;
            case 4:
                sum = q * 120;
                break;
            case 5:
                sum = q * 40;
                break;
            case 6:
                sum = q * 30;
                break;
            default:
                System.out.println("No such option!");
        }

        return sum;
    }

    public static String getItemName(int item) {
        switch (item) {
            case 1:
                return "Aloo Paratha";
            case 2:
                return "Dosa";
            case 3:
                return "Pav Bhaji";
            case 4:
                return "Manchurian";
            case 5:
                return "Diet Coke";
            case 6:
                return "Water";
            default:
                return "Unknown";
        }
    }

    public static void printBill(String item, int quantity, int amount) {
        System.out.println("\n=-=-= BILL =-=-=");
        System.out.println("Item      : " + item);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Amount    : $" + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("1. Aloo Paratha - $70");
        System.out.println("2. Dosa - $120");
        System.out.println("3. Pav Bhaji - $110");
        System.out.println("4. Manchurian - $120");
        System.out.println("5. Diet Coke - $40");
        System.out.println("6. Water - $30");

        System.out.print("\nEnter number of different items: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter item number: ");
            int order = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int amount = billCounter(quantity, order);
            total += amount;

            printBill(getItemName(order), quantity, amount);
        }

        System.out.println("\n====================");
        System.out.println("Grand Total : $" + total);
        System.out.println("====================");
        System.out.println("Thank you for ordering at Vyom's Restaurant!");
        sc.close();
    }
}