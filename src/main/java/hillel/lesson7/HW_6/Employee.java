package hillel.lesson7.HW_6;

public class Employee {

    private String surname;
    private String name;
    private String position;
    private String salaryPerHour;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public String getSalaryPerHour() {
        return salaryPerHour;
    }
    public void setSalaryPerHour(String newSalaryPerHour) {
        salaryPerHour = newSalaryPerHour;
    }
}
