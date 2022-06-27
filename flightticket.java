import java.util.Scanner;

public class flightticket {
    public static void main(String[] args) {
        
        int distance, age, tripType;
        double price, perDistance = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        distance = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter trip type (1- One Direction 2- Round-Trip): ");
        tripType = input.nextInt();
        input.close();

        if (distance < 0 || age < 0 || tripType != 1 && tripType != 2) 
        {
            System.out.print("Please enter a valid number!");
            System.exit(0);
        }

        price = perDistance * distance;

        if (age < 12)
        {
            price = price / 2;
        } else if (age < 24) {
            price = price - (price * 0.1);
        } else if (age > 65) {
            price = price - (price * 0.3);
        }

        if (tripType == 2) 
        {
            price = price - (price * 0.2);
            price = price * 2;
        }

            System.out.print("Total: " + price + " TL");
    }
}