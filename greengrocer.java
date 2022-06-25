import java.util.Scanner;

public class greengrocer {
    public static void main(String[] args) {
        
        double pear, apple, tomatoes, banana, aubergine, totalPrice;
        int pear_bak, apple_bak, tomatoes_bak, banana_bak, aubergine_bak;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Amount of Pears in KG: ");
        pear_bak = input.nextInt();

        System.out.print("Enter the Amount of Apples in KG: ");
        apple_bak = input.nextInt();

        System.out.print("Enter the Amount of Tomatoes in KG: ");
        tomatoes_bak = input.nextInt();

        System.out.print("Enter the Amount of Bananas in KG: ");
        banana_bak = input.nextInt();

        System.out.print("Enter the Amount of Aubergines in KG: ");
        aubergine_bak = input.nextInt();

        pear = pear_bak * 2.14;
        apple = apple_bak * 3.67;
        tomatoes = tomatoes_bak * 1.11;
        banana = banana_bak * 0.95;
        aubergine = aubergine_bak * 5.0;

        totalPrice = (pear + apple + tomatoes + banana + aubergine);
        System.out.print("Total Price: " + totalPrice + " Turkish Lira");
    }
}