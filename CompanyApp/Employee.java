package Company.CompanyApp;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private Address address;

    public Employee(String firstName, String lastName, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getAddressStreet(){
        return this.address.getStreet();
    }

//    public void getAddress
}
