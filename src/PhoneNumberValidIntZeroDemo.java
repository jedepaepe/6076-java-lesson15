import java.util.Scanner;

public class PhoneNumberValidIntZeroDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Veuillez introduire un numéro de téléphone: ");
            PhoneNumberValidIntZero phoneNumber = new PhoneNumberValidIntZero();
            phoneNumber.setValue(scanner.nextLine());
            System.out.println(phoneNumber.getValue());
        } while (true);
    }
}
