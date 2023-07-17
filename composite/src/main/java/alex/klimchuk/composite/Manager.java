package alex.klimchuk.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Manager implements Employee {
    private final String name;
    private final String position;
    private final List<Employee> subordinates;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        System.out.println("Subordinates:");
        for (Employee employee : subordinates) {
            employee.showDetails();
        }
    }
}
