package f17comp1030dec5;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class Student {
    private String name;
    private LocalDate birthday;
    private int studentNumber;
    private int[] grades;
    
    /**
     * This is the constructor for the class.  It is a very special
     * of method that must have the same name as the class 
    */
    public Student(String fullName, LocalDate bd, int studentNum)
    {
        this.name=fullName;
        birthday=bd;
        studentNumber=studentNum;
        grades = new int[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public void setGrade(int courseNum, int grade)
    {
        grades[courseNum-1] = grade;
    }
    
    @Override
    public String toString()
    {
        return String.format("name: %s student number: %d", name, studentNumber); 
    }
}
