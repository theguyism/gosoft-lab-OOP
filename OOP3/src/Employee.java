public class Employee {
    public int salary;
    public String firstName;

    public Employee(int salary, String firstName) {
        this.salary = salary;
        this.firstName = firstName;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}



//    public static void main(String[] args) {
//        Employee[] employees = new Employee[3];
//        for(int i = 0; i< employees.length; i++){
//            employees[i] = new Employee("name" + i, "last");
//        }
//    }
