package Company;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Los Angeles", "rich street", 1);
        Address address2 = new Address("Los Angeles", "rich street", 2);
        Employee employee1 = new Employee("Ionica", "Georgel", 10000, address1);
        Employee employee2 = new Employee("Ionica", "Marcel", 10000, address2);
        Employee[] firstDepEmpList = {employee2, employee1};

//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAddressStreet());
        Department department = new Department("dep1", firstDepEmpList, 2);
//        department.printAllEmployees();
//        department.printNumberOfEmployeesAdded();
//        department.findEmployeeByName("Ionica");
    }
}
