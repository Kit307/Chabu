import java.util.ArrayList;

public class Chabu {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("============================================================");
        System.out.println("\t\t\tCustomer added");
        System.out.println("============================================================");

    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void printCustomers() {

        int i = 1;
        System.out.println("============================================================");
        System.out.println("NO.\tName_Surname\t\tPhone\t\tTotal");
        System.out.println("============================================================");

        for (Customer customer : customers) {

            System.out.print(i + ".\t" + customer.getName() + "_");
            System.out.print(customer.getSurname() + "\t\t\t");
            System.out.print(customer.getPhone() + "\t\t");
            System.out.print(customer.getCustomertotal());
            System.out.println();
            i++;
            System.out.println("-----------------------------------------------------------");

        }
    }
}
