public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;


    public Person(String fullName, String position, String email, String phoneNumber, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("fullname: " + fullName + "; position: " + position + "; email: " + email + "; phoneNumber: " + phoneNumber + "; salary: " + salary + "; age: " + age);
    }

    public int getAge() {
        return age;
    }
}


