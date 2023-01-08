import java.util.List;
import java.util.Scanner;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Veuillez introduire un numéro de téléphone: ");
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setValue(scanner.nextLine());
        } while (true);
    }
}
