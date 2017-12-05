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
 
        Student[] classList = new Student[2];
        classList[0] = matt;
        classList[1] = jaret;
        
        //this would have caused an ArrayIndexOutOfBoundsException
        //because the array only had 2 positions (0 & 1).  When we try
        //put something in position 2, it goes outside of the array
        //and the system can not handle it
        //classList[2] = jaret;  
        
        System.out.println("Displaying information from a loop");
        for (int i=0; i<classList.length; i++)
        {
            System.out.println(classList[i]);
        }
    }
}
