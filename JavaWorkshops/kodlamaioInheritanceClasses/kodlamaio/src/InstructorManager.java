public class InstructorManager extends UserManager {

    @Override
    public void addDatabase(User instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getEmail() +
                " " + instructor.getPassword() + " instructor has been written to database");
    }

    public void givenCourses(Instructor instructor, String[] courses) {
        instructor.setGivenCourseNames(courses);
        System.out.println("Your given courses has been submitted.");
    }
}
