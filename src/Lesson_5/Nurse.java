package Lesson_5;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super ( id, name, department, working );
        System.out.println ( "Nurse in action...." );

    }

    private void checkVitalSigns() {
        System.out.println ( "Checking Vitals...." );
    }

    private void drawBloods() {
        System.out.println ( "drawing blood" );
    }

    private void cleanPatientArea() {
        System.out.println ( "Cleaning patient area" );
    }

    @Override
    public void peformDuties() {
        checkVitalSigns ( );
        drawBloods ( );
        cleanPatientArea ( );
    }
}
