import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
    int number1, number2, selection;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        number1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        number2 = input.nextInt();

        System.out.println("The Action You Want To Do:\n1-Plus\n2-Minus\n3-Times\n4-Divided By");
        System.out.print("Your Choice: ");
        selection = input.nextInt();

    switch (selection) {
        case 1:
            System.out.println("Answer: " + (number1 + number2));
            break;
        case 2:
            System.out.println("Answer: " + (number1 - number2));
            break;
        case 3:
            System.out.println("Answer: " + (number1 * number2));
            break;
        case 4:
        if (number2 == 0) {
            System.out.println("A Number Cannot Be Divided by 0");
            break;
        }else {
            System.out.println("Answer: " + (number1 / number2));
            break;
        }
        default:
            System.out.println("Please enter a valid number and try again.");
            break;
        }
    }
}
