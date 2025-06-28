package Jobsheet15(Collection);

public class TreeSetDemo09 {
    public static void main(String[] args) {
        // Create a TreeSet to store Customer09 objects
        TreeSet09<Customer09> customers = new TreeSet09<>();

        // Add Customer09 objects to the TreeSet
        customers.add(new Customer09(1, "Zakia"));
        customers.add(new Customer09(5, "Budi"));
        customers.add(new Customer09(4, "Cica"));
        customers.add(new Customer09(100, "Rosa"));

        // Print the index of a specific customer
        System.out.println(customers.indexOf(new Customer09(5, "Budi")));

        // Iterate through the TreeSet and print each customer
        for (Customer09 customer : customers) {
            System.out.println(customer.toString());
        }
    }
}
