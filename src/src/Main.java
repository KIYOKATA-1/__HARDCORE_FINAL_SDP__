import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //----- Singleton -----
        UserSingleton user = UserSingleton.getInstance();

        System.out.println("< Enter Your Name:");
        String Name = scanner.nextLine();
        System.out.println("< Enter Your Lastname:");
        String Lastname = scanner.nextLine();

        user.setUserInfo(Name, Lastname);


        MotorcycleFactory factory = new KawasakiMotorcycleFactory();
        MotoOrder order = new MotoOrder();

        Motorcycle motorcycle= factory.createMotorcycle();

        order.addMotorcycle(motorcycle);

        // Use the abstract factory to create the motorcycle
        System.out.println("Do you want to add decorations? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Choose decoration: ");
            System.out.println("1. Custom Paint");
            System.out.println("2. LED Lights");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Motorcycle decoratedMotorcycle = new MotoDecorator(motorcycle, "Custom Paint",1500);
                    order.addDecoration((MotoDecorator) decoratedMotorcycle);
                    break;
                case 2:
                    Motorcycle decoratedMotorcycle2 = new MotoDecorator(motorcycle, "LED Lights",1500);
                    order.addDecoration((MotoDecorator) decoratedMotorcycle2);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Total Price: $" + order.getTotalPrice());

            System.out.println("----- CHOOSE THE PAYMENT METHOD -----");
            System.out.println("< 1. QR");
            System.out.println("< 2. Card");
            int choicee = scanner.nextInt();

            switch (choicee){
                case 1:
                    QRPayment qrPayment = new qrAdapter(new QR());
                    qrPayment.processQR("---------");
            }

            // Display details and price of the selected motorcycle
            System.out.println("You have ordered the following motorcycle:");
            System.out.println(motorcycle.getDetails());
            System.out.println("Total Price: $" + order.getTotalPrice());
        }
    }
}