public class Programmer extends Employee{
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }

    @Override
    public void hello() {
        super.hello();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    public void createWebsite(String template, String titleName){
        System.out.println("Website created");
    }

    public void installWindows(String version, String productKey){
        System.out.println("Windows installed");
    }
}
