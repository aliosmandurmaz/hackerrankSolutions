public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Ali Osman";
        customer.lastName = "Durmaz";
        customer.age = 27;
        customer.email = "odurmaz.34@outlook.com";

        System.out.println(customer.id);
        System.out.println(customer.firstName);
        System.out.println(customer.lastName);
        System.out.println(customer.age);
        System.out.println(customer.email);



        Employee employee = new Employee();
        employee.id = 1;
        employee.firstName = "Ahmet";
        employee.lastName = "Aydın";
        employee.age = 30;
        employee.salary = 5000;


        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();


    }
}
