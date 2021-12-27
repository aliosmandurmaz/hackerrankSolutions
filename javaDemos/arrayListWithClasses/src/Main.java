import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"osman","durmaz"));
        customers.add(new Customer(2,"ayşe","durmaz"));
        customers.add(new Customer(3,"ahmet","durmaz"));

        for (Customer customer : customers) {
            System.out.println(customer.firstName+" "+customer.lastName+" "+customer.id);
        }

    }
}
