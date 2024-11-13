public class Employee {

    private static int idGenerator = 1;

    private final int id;

    private final String surname;
    private final String name;
    private final String patronymic;
    private int department;
    private int salary;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        id = idGenerator++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", " +
                surname + ' ' +
                name + ' ' +
                patronymic + ' ' +
                ", department=" + department +
                ", salary=" + salary;
    }
}
