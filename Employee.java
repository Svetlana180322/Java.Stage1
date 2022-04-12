/**
  * Java level 1. Homework - 5
  *
  *@author Svetlana Budzinskaia
  *@version 12.04.2022
  */
  
public class Employee {
    private String FIO;
    private String Position;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;
    
    public Employee(String FIO, String Position, String Email, String Phone, int Salary, int Age) {
        this.FIO = FIO;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Age = Age;
    }
    public void info() {
        System.out.println("FIO: " + FIO + "; Position: " + Position + "; Email: " + Email + "; Phone: " + Phone + "; Salary: " + Salary + "; Age: " + Age);
    }
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[2] = new Employee("Sidorov Sidr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[3] = new Employee("Pavlov Pavel", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 60);
        persArray[4] = new Employee("Andreev Andrey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        for (int x = 0; x < 5; x++) {
            if (persArray[x].Age > 40) {
                persArray[x].info();
                }
            }
    }
}


