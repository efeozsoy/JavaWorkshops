public class Student extends User {

    private String studentNumber;
    private String[] takenCourseNames;
    private int chapter;

    public Student(){
    }

    public Student(String studentNumber, String[] takenCourseNames, int chapter) {
        super();
        this.studentNumber = studentNumber;
        this.takenCourseNames = takenCourseNames;
        this.chapter = chapter;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String[] getTakenCourseNames() {
        return takenCourseNames;
    }

    public void setTakenCourseNames(String[] takenCourseNames) {
        this.takenCourseNames = takenCourseNames;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
}
