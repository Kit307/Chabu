import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Chabu chabu = new Chabu();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.print("\033[H\033[2J");
        do {
            // clear the screen

            System.out.println("1. Add customer");
            System.out.println("2. Print customers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    Customer customer = new Customer();
                    System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    System.out.print("Enter customer surname: ");
                    String surname = scanner.next();
                    System.out.print("Enter customer phone: ");
                    String phone = scanner.next();
                    System.out.print("Enter customer total: ");
                    int total = scanner.nextInt();
                    customer.setName(name);
                    customer.setSurname(surname);
                    customer.setPhone(phone);
                    customer.setCustomertotal(total);
                    System.out.print("\033[H\033[2J");
                    chabu.addCustomer(customer);
                    break;

                case 2:
                    chabu.printCustomers();
                    break;
                case 3:
                    exit = true;
                    break;
            }
        } while (exit == false);
    }
}
