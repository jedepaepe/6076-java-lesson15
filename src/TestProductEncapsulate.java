import java.util.Scanner;

public class TestProductEncapsulate {
    public static void main(String[] args) {
        System.out.println("Product Form");
        Scanner scanner = new Scanner(System.in);
        ProductEncapsulation product = new ProductEncapsulation();
        System.out.print("numéro: ");
        product.setNumber(scanner.nextLine());
        System.out.print("label: ");
        product.setLabel(scanner.nextLine());
        System.out.print("prix: ");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.print("stock: ");
        product.setStock(Double.parseDouble(scanner.nextLine()));
        System.out.println("Le produit " + product.getLabel() + " est enregistré");
    }
}
