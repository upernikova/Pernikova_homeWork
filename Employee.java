public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // Конструктор, в котором приравниваются поля к аргументам из конструктора
    public Employee(String firstName, String lastName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public String toString() {
        return  "Имя: " + firstName + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Должность: " + position + "\n" +
                "Email: " + email + "\n" +
                "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age;
    }
}