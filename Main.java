public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Oliver", "Martin", "Network Administrator", "oliver.martin@example.com", "+15556789012", 72000, 32);

        System.out.println("\nTask 1:");
        System.out.println(person);

        System.out.println("\nTask 2:");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John", "Smith", "Software Engineer", "john.smith@example.com", "+15551234567", 95000, 29);
        employees[1] = new Employee("Emily", "Johnson", "Data Analyst", "emily.johnson@example.com", "+15552345678", 80000, 26);
        employees[2] = new Employee("Michael", "Brown", "Project Manager", "michael.brown@example.com", "+15553456789", 100000, 35);
        employees[3] = new Employee("Sophia", "Davis", "UX Designer", "sophia.davis@example.com", "+15554567890", 85000, 31);
        employees[4] = new Employee("James", "Wilson", "IT Support Specialist", "james.wilson@example.com", "+15555678901", 65000, 40);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник " + (i + 1) + ":\n" + employees[i] + "\n");
        }

        Park park = new Park("Wonderland");

        park.addAttraction("Ferris Wheel", "10:00 - 23:00", 9);
        park.addAttraction("Drop Tower", "10:00 - 20:00", 13);

        System.out.println("Task 3:");
        System.out.println("Аттракционы в парке " + park.getName() + ":");
        park.listAttractions();
    }
}