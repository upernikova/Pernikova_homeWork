public class GroupEmployee {
    /*
     Создала метод для реализации в отдельном классе
     */
    public void joinGoup() { //метод для создания отдельного массива
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John", "Smith", "Software Engineer",
                "john.smith@example.com", "+15551234567", 95000, 29);

        employees[1] = new Employee("Emily", "Johnson", "Data Analyst",
                "emily.johnson@example.com", "+15552345678", 800000, 26);

        employees[2] = new Employee("Michael", "Brown", "Project Manager",
                "michael.brown@example.com", "+15553456789", 100000, 35);

        employees[3] = new Employee("Sophia", "Davis", "UX Designer",
                "sophia.davis@example.com", "+15554567890", 85000, 31);

        employees[4] = new Employee("James", "Wilson", " IT Support Specialist",
                "james.wilson@example.com", "+15555678901", 650000, 40);
        /*
        Метод для проверки массива
         */
        for (Employee employee : employees) {
            System.out.println("\n" + employee);
        }
    }
}