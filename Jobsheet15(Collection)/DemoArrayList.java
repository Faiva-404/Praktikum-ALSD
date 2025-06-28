package Jobsheet15(Collection);

import java.util.Scanner;

public class DemoArrayList {
    ArrayList09<Customer09> customers = new ArrayList09<>(2);

    Customer09 customer1 = new Customer09(1, "Zakia");
    Customer09 customer2 = new Customer09(5, "Budi");

    customers.add(customer1);
    customers.add(customer2);

    customers.add(new Customer09(4, "Cica"));

    customers.add(new Customer09(100, "Rosa"));

    System.out.println(customers.indexOf(customer2));

    for (Customer09 customer : customers) {
        System.out.println(customer.toString());
    }
}
