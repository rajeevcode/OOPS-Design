package Lesson_5;

public class HospitalManagement {

    /*
    Strategy Design Pattern - This patterns enables an algorithm behaviour to be selected at runtime.This pattern
    lets the algorithm very independently from the clients that used it.This is what we accomplished,we incapsulated the
    details of work a particular kind of employee does. Clients can now use a consistence interface to tell employees
    to perform their respective responsibilities without getting into what they are and how specific employees perform
    them.
    Here a unit test written for Hospital Management class will not require modification,if we extended the system to
    support several different kinds of employees because all these employees will respond to the perform duties message.
     */
    public void callUpon(Employee employee) {
        employee.peformDuties ( );

    }


}
