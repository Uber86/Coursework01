public class EmployeeBook {

    private final Employee[] emplyees = new Employee[10];

    private int size;

    //Очень сложно
    // A
    public boolean add(Employee employee) {
        for (int i = 0; i < emplyees.length; i++) {
            if (emplyees[i] == null) {
                emplyees[i] = employee;
                return true ;
            }
        }
        return false;

    }

    // B
    public void delEmployee(int id) {
        for (int i = 0; i < emplyees.length; i++) {
            if (emplyees[i].getId()==id) {
                emplyees[i] = null;
                return;
            }
        }
    }

    // 5
    public void findId(int id) {
        for (int i = 0; i < emplyees.length; i++) {
            if (emplyees[i].getId()== id) {
                System.out.println(emplyees[i].getName());
            }
        }
        return;
    }








    // А
    public  void employeeData() {
        for (Employee emplyee : emplyees) {
            System.out.println(emplyee);

        }
    }

    // B
    public  int sumSalary() {
        int sum = 0;
        for (Employee employee : emplyees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //C
    public  Employee minSalary() {
        Employee min = emplyees[0];
        for (Employee employee : emplyees) {
            if (min.getSalary() > employee.getSalary()) {

                min = employee;
            }
        }
        return min;
    }

    //D
    public  Employee maxSalary() {
        Employee max = emplyees[0];
        for (Employee employee : emplyees) {
            if (max.getSalary() < employee.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    //E
    public  void midlSalary() {
        int sum = 0;
        for (Employee employee : emplyees) {
            sum += employee.getSalary();
        }
        System.out.println(sum / emplyees.length);
    }

    //F
    public  void nameEmployee() {
        for (Employee emplyee : emplyees) {
            System.out.println(emplyee.getName());
        }
    }


    // Повышеная сложность
    // 1
    public  int indexSalary(double index) {
        for (Employee employee : emplyees) {
            System.out.println((double)employee.getSalary() * index);
        }
        return 0;
    }

    // A
    public  Employee minSalaryDep(int departament) {
        Employee min = emplyees[0];
        for (Employee employee : emplyees) {
            if (employee.getDepartment()== departament && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    // B
    public  Employee maxSalaryDep(int departament) {
        Employee max = emplyees[0];
        for (Employee employee : emplyees) {
            if (departament== employee.getDepartment() && max.getSalary() < employee.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    // C
    public  void sumSalaryDep(int departament) {
        int sum = 0;
        for (Employee employee : emplyees) {
            if (departament == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на депортамент: "+ sum);
    }

    // D
    public  double midlSalaryDep(int departament) {
        int people = 0;
        int sum = 0;
        for (Employee employee : emplyees) {
            if (employee.getDepartment() == departament){
                sum += employee.getSalary();
                people ++;
            }
        }
        return (double) sum / people;
    }

    // E
    public  int indexSalaryDep(int departament , double index) {
        for (Employee employee : emplyees) {
            if (employee.getDepartment() == departament) {
                System.out.println((double)employee.getSalary() * index);
            }
        }
        return 0;
    }

    //F
    public  void nameEmployeeDep(int departament) {
        for (Employee emplyee : emplyees) {
            if (emplyee.getDepartment()==departament)
                System.out.println(emplyee.getName()+ ". ЗП: " + emplyee.getSalary()+ ". ID: " + emplyee.getId());
        }
    }

    //3.1
    public  void minSalaryInt(int number) {
        for (Employee employee : emplyees) {
            if (employee.getSalary() < number) {
                System.out.println("ID: " + employee.getId() + " " + employee.getName() + ". ЗП: " + employee.getSalary());
            }
        }
    }

    // 3.2
    public  void maxSalaryInt(int number) {
        for (Employee employee : emplyees) {
            if (employee.getSalary() >= number) {
                System.out.println("ID: " + employee.getId() + " " + employee.getName() + ". ЗП: " + employee.getSalary());
            }
        }
    }

}
