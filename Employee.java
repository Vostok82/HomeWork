import java.util.Locale;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info (){
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Andreev Andrey", "Engineer", "andreev.a@mail.box", "0670000001", 1500, 50);
        empArray[1] = new Employee("Ivanova Anna", "Accountant", "ivanova.a@mail.box", "0670000002", 1100, 35);
        empArray[2] = new Employee("Orlov Dmitriy", "Office manager", "orlov.d@mail.box", "0670000003", 300, 21);
        empArray[3] = new Employee("Panina Elena", "Head of Department", "panina.e@mail.box", "0670000004", 2000, 44);
        empArray[4] = new Employee("Tarasenko Evgeniy", "Security", "tarasenko.e@mail.box", "0670000005", 1000, 60);

        for (int i = 0; i < empArray.length; i++) {
            if (age > 39) {
                System.out.println(empArray[i]);
            }
        }
    }
}

