public class Main {
    public static void main(String[] args) {
        GroupEmployee group = new GroupEmployee();
        Employee person = new Employee("Oliver", "Martin",
                "Network Administrator", "oliver.martin@example.com", "+15556789012",
                72000, 32);
        /*
        Cоздала 2 экземпляра класса Attractions
         */
        Park park = new Park("Wonderland");

        System.out.println("\nTask 1: ");
        System.out.println(person.toString());
        System.out.println("\nTask 2: ");
        group.joinGoup();
        System.out.println("\nTask 3: ");
        park.newAttraction("Ferris Wheel", "From 10.00 to 23.00", 9);
        park.newAttraction("Drop Tower", "From 10.00 to 20.00", 13);
        park.info();
    }
}