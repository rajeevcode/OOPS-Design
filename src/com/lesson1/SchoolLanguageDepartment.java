package com.lesson1;

public class SchoolLanguageDepartment {

    SpanishCourse spanish;
    FrenchCourse french;
    HindiCourse hindi;

    /*
    UML Diagram eg - SchoolLanguageDepartment -> SpanishCourse -> Student

    Composition Association - the relationship between school and course is Composition relationship.
    The relation between school Department and the course is composite relationship because of school department can be
    composed on many courses.If department closes down then courses of that department no longer exists in the application.

     Aggregation Association -
      relationship between course and student is Aggregation Association.The course does not own a students.If the course is cancelled
      of removed from the registration that does not mean that Student no longer exists in the application.
      The student object can be registered to many other courses in many other departments.So,in running application Student
      objects can still exists and it is independent of the particular course or the particular department that it closes down.

      School department owns many courses but course does not own a student.
     */

}
