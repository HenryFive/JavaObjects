package StudentClass;

public class Student {
    private String studentName;
    private int studentID;
    private String studentCurriculum;

    public void setter(String newName, int newID, String newCurriculum){
        this.studentName = newName;
        this.studentID = newID;
        this.studentCurriculum = newCurriculum;
    }

    public String get(){

        return "Student name " + studentName + " with ID no. " + studentID+ " has a Curriculum " + studentCurriculum;
    }
}
