public class Teacher {
    String name;
    String subject;
    double salary;

    Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacher() {
        System.out.println("name: " + name + "subject: " + subject + "salary: " + salary);
    }


}
