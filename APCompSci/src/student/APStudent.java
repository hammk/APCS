package student;

/**
 * This class represents a student by their first and
 * last name, as well as their student ID and GPA.
 * @author humzahkha0143
 */
public class APStudent {
    
    private String fName;
    private String lName;
    private double gpa;
    private int id;
    
    /**
     * Default constructor; takes a first and last name,
     * initializes their GPA to 0.0, and randomly generates
     * an ID number for them.
     * @param f - First Name
     * @param l - Last Name
     */
    public APStudent(String f, String l) {
        fName = f;
        lName = l;
        gpa = 0.0;
        id = ((int)(Math.random()*10000) + 2030000);
        
    }

    /**
     * Returns student's First Name.
     * @return fName - instance var representing First Name
     */
    public String getFirstName() {
        return fName;
    }

    /**
     * Returns student's Last Name.
     * @return lName - instance var representing First Name
     */
    public String getLastName() {
        return lName;
    }

    /**
     * Returns student's GPA.
     * @return gpa - instance var representing GPA.
     */
    public double getGPA() {
        return gpa;
    }
    
    /**
     * Sets GPA to a given double.
     * @param gpa - Student's new GPA.
     */
    public void setGPA(double gpa ) {
        this.gpa = gpa;
    }

    /**
     * Returns student's ID Number.
     * @return fName - instance var representing ID number.
     */
    public int getIDNum() {
        return id;
    }
    
    /**
     * Returns an overview of a student.
     * @return Student John Doe has an ID of 2031337 and a GPA of 3.69.
     */
    public String toString() {
        return "Student " + getFirstName() + " " + getLastName() + " has an ID of " + getIDNum() + " and a GPA of " + getGPA() + ".";
    }
    
    
}
