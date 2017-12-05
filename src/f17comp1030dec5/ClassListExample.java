package f17comp1030dec5;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jwright
 */
public class ClassListExample {
    public static void main(String[] args)
    {
        Student matt = new Student("Matt", LocalDate.of(1999, Month.MARCH, 20), 10001);
        Student jaret = new Student("Jaret Wright", LocalDate.of(1956, Month.JANUARY, 10),10002);
        
        System.out.printf("The student number for %s is %d%n", matt.getName(),
                                                             matt.getStudentNumber());
        
        System.out.printf("The student number for %s is %d%n", jaret.getName(),
                                                          jaret.getStudentNumber());
 }
}
