public class Programmer extends Employee implements IWebsiteCreator, IWindowsInstaller{
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

    @Override
    public void createWebsite(String template, String titleName) {
        System.out.println("Setup template: " + template);
        System.out.println("Set Title name: " + titleName);

    }

    @Override
    public void formatWindows(String drive) {
        System.out.println("Window formatted");
    }

    @Override
    public void installWindows(String version, String productKey) {
        System.out.println("Window installed");
    }

    @Override
    public int getLastInstalledWindowsVersion() {
        return 0;
    }

    public void FixPC(String serialNumber) {
        System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
    }

}

