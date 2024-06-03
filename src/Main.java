public class Main {

    public static void main(String[] args) {
        EmployeeBook empl = new EmployeeBook();


        empl.add(new Employee("Вазардов Василий Иванович", 1, 44331));
        empl.add(new Employee("Прекрасная Елена Матерьбожья", 2, 65375));
        empl.add(new Employee( "Пятухов Петр Пертович" , 3, 86000));
        empl.add(new Employee("Бородач Александр Радионович", 4, 101000));
        empl.add(new Employee("Белый Александр Бандитович", 5, 14000));
        empl.add(new Employee("Дуров Павел Сергеевич", 1, 20000));
        empl.add(new Employee("Джопс Стив Младший", 2, 19999));
        empl.add(new Employee("Ньюэлл Гейб Гдехайфлайф3", 3, 17171));
        empl.add(new Employee("Береза Богдан Богданович", 4, 49212));

        /*
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
        */

        //Очень сложно
        empl.employeeData();
        System.out.println();
        // A
        empl.add(new Employee("Петров Паша Петрович", 2, 15111));
        empl.employeeData();
        System.out.println();
        // B
        empl.delEmployee(7);
        empl.employeeData();
        System.out.println();
        // 5
        empl.findId(1);

        /*
        // Вывод сотрудников
        empl.employeeData();
        System.out.println();

        // A
        System.out.println(empl.sumSalary());
        System.out.println();

        // B
        System.out.println(empl.minSalary());
        System.out.println();

        // C
        System.out.println(empl.maxSalary());
        System.out.println();

        // E
        empl.midlSalary();
        System.out.println();

        // F
        System.out.println();
        empl.nameEmployee();

        // Повышеная сложность
        //1
        empl.indexSalary(1.2);
        System.out.println();

        //A
        System.out.println(empl.minSalaryDep(1));
        System.out.println();

        //B
        System.out.println(empl.maxSalaryDep(1));
        System.out.println();

        //C
        empl.sumSalaryDep(1);
        System.out.println();

        //D
        System.out.println(empl.midlSalaryDep(1));
        System.out.println();

        //E
        empl.indexSalaryDep(1, 1.2);
        System.out.println();

        //F
        empl.nameEmployeeDep(1);
        System.out.println();

        //3.1
        empl.minSalaryInt(20000);
        System.out.println();

        //3.1
        empl.maxSalaryInt(20000);
        System.out.println();

         */

    }

}