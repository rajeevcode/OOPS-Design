package Lesson_5;

abstract public class Employee {

    private int id;
    private String name;
    private String department;
    private Boolean working;

    public Employee(int id, String name, String department, boolean working) {
        super ( );
        this.id = this.id;
        this.name = this.name;
        this.department = this.department;
        this.working = this.working;
    }

    public abstract void peformDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}