public class StudentManager extends UserManager {

    @Override
    public void addDatabase(User student){
        System.out.println(student.getFirstName()+ " " + student.getLastName()+ " " + student.getEmail()+ " " +
                student.getPassword() + " " + "student has been written to database");
    }

    public void setCourses(Student student, String[] courses){
        student.setTakenCourseNames(courses);
        System.out.println("Your courses has been submitted.");
    }
}
