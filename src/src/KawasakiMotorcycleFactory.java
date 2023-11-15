import java.util.Scanner;

public class KawasakiMotorcycleFactory implements MotorcycleFactory {
    @Override
    public Motorcycle createMotorcycle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a color for your Kawasaki motorcycle:");
        System.out.println("1 - Black");
        System.out.println("2 - Red");
        System.out.println("3 - White");

        int colorChoice = scanner.nextInt();

        String color;
        switch (colorChoice) {
            case 1:
                color = "Black";
                break;
            case 2:
                color = "Red";
                break;
            case 3:
                color = "White";
                break;
            default:
                throw new IllegalArgumentException("Invalid color choice");
        }

        System.out.println("~~~~~ Choose Kawasaki motorcycle model: ~~~~~");
        System.out.println("1 - Ninja 1000");
        System.out.println("2 - Ninja 600");
        System.out.println("3 - Ninja 400");


        int modelChoice = scanner.nextInt();

        switch (modelChoice) {
            case 1:
                return new Kawasaki1000(color);
            case 2:
                return new Kawasaki600(color);
            case 3:
                System.out.println("This model is not availible");
                scanner.close();
                break;
            default:
                throw new IllegalArgumentException("Invalid motorcycle model choice");
        }
        return createMotorcycle();
    }
}
