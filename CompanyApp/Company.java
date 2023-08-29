package Company;

public class Company {
    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartmentsAdded;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartmentsAdded) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartmentsAdded() {
        return numberOfDepartmentsAdded;
    }

    public void setNumberOfDepartmentsAdded(int numberOfDepartmentsAdded) {
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }


}

