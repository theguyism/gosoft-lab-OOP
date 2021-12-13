public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        for(int i = 0; i< employees.length; i++){
            employees[i] = new Employee(i * 1000,"name" + i);
        }
        System.out.println(employees[0].getSalary());
    }
}
