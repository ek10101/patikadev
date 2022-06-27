import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        
        int birth, zodiac;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        birth = input.nextInt();
        input.close();

        zodiac = birth % 12;

    switch (zodiac) 
    {
        case 0:
            System.out.print("Your chinese zodiac sign: Monkey");
        break;

        case 1:
            System.out.print("Your chinese zodiac sign: Cockerel");
        break;

        case 2:
            System.out.print("Your chinese zodiac sign: Dog");
        break;

        case 3:
            System.out.print("Your chinese zodiac sign: Pig");
        break;

        case 4:
            System.out.print("Your chinese zodiac sign: Mouse");
        break;

        case 5:
            System.out.print("Your chinese zodiac sign: Ox");
        break;

        case 6:
            System.out.print("Your chinese zodiac sign: Tiger");
        break;

        case 7:
            System.out.print("Your chinese zodiac sign: Rabbit");
        break;

        case 8:
            System.out.print("Your chinese zodiac sign: Dragon");
        break;

        case 9:
            System.out.print("Your chinese zodiac sign: Snake");
        break;

        case 10:
            System.out.print("Your chinese zodiac sign: Horse");
        break;

        case 11:
            System.out.print("Your chinese zodiac sign: Sheep");
        break;

    }
    
    }
}
