package Static.cw1;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNumbers;
    private static int studentCounter;

    public Student(String firstName, String lastName, int indexNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumbers = indexNumbers;
        studentCounter++;
    }

    public static int getStudentsNumber() {
        return studentCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumbers() {
        return indexNumbers;
    }

    public void setIndexNumbers(int indexNumbers) {
        this.indexNumbers = indexNumbers;
    }
}
