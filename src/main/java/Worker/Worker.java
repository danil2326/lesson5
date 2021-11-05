package Worker;

public class Worker {
    String fullname;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void printWork() {

        System.out.println("ФИО: " + fullname + " Должность: " + position + " Email: " + email + " Зарплата: " + salary + " Возраст: " + age );

    }
}
