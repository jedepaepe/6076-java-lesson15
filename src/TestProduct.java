import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        System.out.println("Product Form");
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.print("numéro: ");
        product.number = scanner.nextLine();
        System.out.print("label: ");
        product.label = scanner.nextLine();
        System.out.print("prix: ");
        product.price = scanner.nextDouble();
        System.out.print("stock: ");
        product.stock = scanner.nextDouble();
        System.out.println("Le produit " + product.label + " est enregistré");
    }
}
