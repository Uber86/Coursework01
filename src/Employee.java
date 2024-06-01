import java.util.Objects;

public class Employee {
    private String name;  // ФИО не стал писать , пусть останется так
    private int department;
    private int salary;

    private static int count = 0;
    private int id;


    public Employee(String name , int department, int salary) {
        if (department < 1 || department > 5) {
            throw new RuntimeException("Ошибка ввода. Такого отдела нет");
        }else{
            this.name = name;
            this.department = department;
            this.salary = salary;
            id = ++ count;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + name + ". Отдел № " + department + ". Заработная плата: " + salary + ". Id:  " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}



