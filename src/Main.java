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
}