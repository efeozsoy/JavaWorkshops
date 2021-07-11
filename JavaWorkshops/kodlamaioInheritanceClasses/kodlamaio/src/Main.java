public class Main {
    public static void main(String[] args) {
        String[] courses = {"Java", "C#"};
        Student student = new Student("12345",courses, 4);
        student.setAddress("Istanbul");
        student.setFirstName("Gülşan");
        student.setEmail("gulsan@gmail.com");
        student.setPassword("123456");
        StudentManager studentManager = new StudentManager();
        studentManager.addDatabase(student);

        Instructor instructor = new Instructor();
        instructor.setFirstName("Efe");
        instructor.setLastName("Özsoy");
        instructor.setSpeciality("Python");
        instructor.setEmail("efeeozsoy@gmail.com");
        instructor.setPassword("efe123");
        String[] givenCourses = {"Java", "Python", "Flutter"};
        instructor.setGivenCourseNames(givenCourses);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addDatabase(instructor);
        instructorManager.signIn(instructor);
    }
}
