public class Main {

    public static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        System.out.println("course paper #1.");
        System.out.println();
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 60_000);
        employees[1] = new Employee("Дмитров", "Дмитий", "Дмитрович", 2, 70_000);
        employees[2] = new Employee("Михалов", "михаил", "Михайлович", 3, 80_000);
        employees[3] = new Employee("Петров", "Петр", "Петрович", 3, 80_000);
        employees[4] = new Employee("Степанов", "Степан", "Степанович", 4, 100_000);
        print();
        System.out.println("Сумма затрат на ЗП всех сотрудников:" + theAmountOfSalaryExpensesPerMonth());
        System.out.println("Сотрудник с минимальной ЗП:" + minWage());
        System.out.println("Сотрудник с максимальной ЗП:" + maxWage());
        System.out.println("Средняя ЗП:" + theAverageValueOfSalaries());
        printFullNames();
    }

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int theAmountOfSalaryExpensesPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minWage() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee maxWage() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double theAverageValueOfSalaries() {
        return (double) theAmountOfSalaryExpensesPerMonth() / employees.length;
    }

    private static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }
}