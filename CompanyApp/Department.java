package Company.CompanyApp;

public class Department {

    private String name;
    private Employee[] employees;
    private int numberOfEmployeesAdded;

    public Department(String name, Employee[] employees, int numberOfEmployeesAdded) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesAdded() {
        return numberOfEmployeesAdded;
    }

    public void setNumberOfEmployeesAdded(int numberOfEmployeesAdded) {
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    public void printAllEmployees() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public void printAllEmployeesAddressStreets() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            System.out.println(employees[i].getAddressStreet());
        }
    }

    public void printNumberOfEmployeesAdded() {
        System.out.println("Numarul de angajati al departamentului  " + this.name + " este " + this.numberOfEmployeesAdded);
    }

    public String findEmployeeByName(String name) {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if (employees[i].getName().equals(name)) {
                return name;
            }
        }
        return null;
    }

    public void findEmployeeAddress(String name) {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Adresa angajatului " + name + " este " + employees[i].getAddress());
            }
        }
    }

    public void findAddressByStreet(String street){
        int nr=0;
        for (int i = 0; i < numberOfEmployeesAdded; i++){
            if(employees[i].getAddress().getStreet().equals(street)){
                nr++;
                System.out.println(employees[i].getAddressStreet() + " nr " + employees[i].getAddress().getNumber());
            }
        }
        if (nr ==0){
            System.out.println("Niciun angajat din lista nu are adresa la aceasta strada");
        }
    }
}

