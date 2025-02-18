import java.util.*;

public class VendingMachine {
    private static Scanner sc = new Scanner(System.in);

    private static String[] entities = new String[]{"Coca", "Pepsi", "Sprite", "Snake", "Shut down machine"};

    private static int printMenu() {
        System.out.println("-----Menu-----");
        for (int i = 0; i < 5; i++)
            System.out.println((i + 1) + ". " + entities[i]);
        System.out.print("Please enter the number: ");

        return sc.nextInt() - 1;
    }

    private static void printPrice(int choice) throws ArithmeticException {
        int price = 0;

        switch (choice) {
            case 0:
            case 1:
            case 2:
                price = 2;
                break;
            
            case 3:
                price = 6;
                break;

            case 4:
                System.exit(0);

            default:
                throw new ArithmeticException();
        }
        System.out.print("The price of " + entities[choice] + " is: ");
        System.out.print(price + "$, please enter the amount of money: ");

        int pay = sc.nextInt();

        if (pay >= price) 
            System.out.println("Your change is " + (pay - price) + "$");
        else 
            System.out.println("Not enough money to buy this item. Please select again");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                int choice = printMenu();
                printPrice(choice);
            }
            catch (ArithmeticException e) {
                System.out.println("Please enter the valid number");
            }
       }
   }
}