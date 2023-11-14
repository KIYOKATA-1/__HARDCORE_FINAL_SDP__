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
    }
}