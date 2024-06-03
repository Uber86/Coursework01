public class Main {
    public static Employee[] emplyees = new Employee[10];

    public static void main(String[] args) {

        emplyees[0] = new Employee("Вазардов Василий Иванович", 1, 44331);
        emplyees[1] = new Employee("Прекрасная Елена Матерьбожья", 2, 65375);
        emplyees[2] = new Employee("Пятухов Петр Пертович", 3, 86000);
        emplyees[3] = new Employee("Бородач Александр Радионович", 4, 101000);
        emplyees[4] = new Employee("Белый Александр Бандитович", 5, 14000);
        emplyees[5] = new Employee("Дуров Павел Сергеевич", 1, 20000);
        emplyees[6] = new Employee("Джопс Стив Младший", 2, 19999);
        emplyees[7] = new Employee("Ньюэлл Гейб Гдехайфлайф3", 3, 17171);
        emplyees[8] = new Employee("Береза Богдан Богданович", 4, 49212);
        emplyees[9] = new Employee("Грозный Сергей Иванович", 5, 15241);


        // Вывод сотрудников
        employeeData();
        System.out.println();

        // A
        System.out.println(sumSalary());
        System.out.println();

        // B
        System.out.println(minSalary());
        System.out.println();

        // C
        System.out.println(maxSalary());
        System.out.println();

        // E
        midlSalary();
        System.out.println();

        // F
        System.out.println();
        nameEmployee();

        // Повышеная сложность
        //1
        indexSalary(1.2);
        System.out.println();

        //A
        System.out.println(minSalaryDep(1));
        System.out.println();

        //B
        System.out.println(maxSalaryDep(1));
        System.out.println();

        //C
        sumSalaryDep(1);
        System.out.println();

        //D
        System.out.println(midlSalaryDep(1));
        System.out.println();

        //E
        indexSalaryDep(1, 1.2);
        System.out.println();

        //F
        nameEmployeeDep(1);
        System.out.println();

        //3.1
        minSalaryInt(20000);
        System.out.println();

        //3.1
        maxSalaryInt(20000);
        System.out.println();
    }



    // А
    public static void employeeData() {
        for (Employee emplyee : emplyees) {
            System.out.println(emplyee);

        }
    }

    // B
    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : emplyees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //C
    public static Employee minSalary() {
        Employee min = emplyees[0];
        for (Employee employee : emplyees) {
            if (min.getSalary() > employee.getSalary()) {

                min = employee;
            }
        }
        return min;
    }

    //D
    public static Employee maxSalary() {
        Employee max = emplyees[0];
        for (Employee employee : emplyees) {
            if (max.getSalary() < employee.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    //E
    public static void midlSalary() {
        int sum = 0;
        for (Employee employee : emplyees) {
            sum += employee.getSalary();
        }
        System.out.println(sum / emplyees.length);
    }

    //F
    public static void nameEmployee() {
        for (Employee emplyee : emplyees) {
            System.out.println(emplyee.getName());
        }
    }


    // Повышеная сложность
    // 1
    public static int indexSalary(double index) {
        for (Employee employee : emplyees) {
            System.out.println((double)employee.getSalary() * index);
        }
        return 0;
    }

    // A
    public static Employee minSalaryDep(int departament) {
        Employee min = emplyees[0];
        for (Employee employee : emplyees) {
            if (employee.getDepartment()== departament && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    // B
    public static Employee maxSalaryDep(int departament) {
        Employee max = emplyees[0];
        for (Employee employee : emplyees) {
            if (departament== employee.getDepartment() && max.getSalary() < employee.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    // C
    public static void sumSalaryDep(int departament) {
        int sum = 0;
        for (Employee employee : emplyees) {
            if (departament == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на депортамент: "+ sum);
    }

    // D
    public static double midlSalaryDep(int departament) {
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
    public static int indexSalaryDep(int departament , double index) {
        for (Employee employee : emplyees) {
            if (employee.getDepartment() == departament) {
                System.out.println((double)employee.getSalary() * index);
            }
        }
        return 0;
    }

    //F
    public static void nameEmployeeDep(int departament) {
        for (Employee emplyee : emplyees) {
            if (emplyee.getDepartment()==departament)
                System.out.println(emplyee.getName()+ ". ЗП: " + emplyee.getSalary()+ ". ID: " + emplyee.getId());
        }
    }

    //3.1
    public static void minSalaryInt(int number) {
        for (Employee employee : emplyees) {
            if (employee.getSalary() < number) {
                System.out.println("ID: " + employee.getId() + " " + employee.getName() + ". ЗП: " + employee.getSalary());
            }
        }
    }

    // 3.2
    public static void maxSalaryInt(int number) {
        for (Employee employee : emplyees) {
            if (employee.getSalary() >= number) {
                System.out.println("ID: " + employee.getId() + " " + employee.getName() + ". ЗП: " + employee.getSalary());
            }
        }
    }


}