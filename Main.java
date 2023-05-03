import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ShoppingCart cart = new ShoppingCart();

            Product product1 = new Product("Keyboard", 500.0);
            Product product2 = new Product("Mouse", 300.0);
            Product product3 = new Product("Monitor", 2500.0);

            System.out.println("Welcome to our computer store!");
            System.out.println("Here are the available products:");
            System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
            System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
            System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());

            System.out.print("Enter the product number you wish to purchase: ");
            int productNumber = scanner.nextInt();

            switch (productNumber) {
                case 1:
                    cart.addItem(product1);
                    break;
                case 2:
                    cart.addItem(product2);
                    break;
                case 3:
                    cart.addItem(product3);
                    break;
                default:
                    System.out.println("Invalid product number. Please try again.");
                    break;
            }

            System.out.println("Total items in cart: " + cart.getItemCount());
            System.out.println("Total price: $" + cart.getTotalPrice());

            System.out.print("Enter amount to pay: $");
            double amountPaid = scanner.nextDouble();

            Payment payment = new Payment(cart.getTotalPrice());
            payment.setAmountPaid(amountPaid);

            double change = payment.getChange();

            if (change >= 0) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your change is: $" + change);
            } else {
                System.out.println("Sorry, not enough money!");
            }
        }
    }
}