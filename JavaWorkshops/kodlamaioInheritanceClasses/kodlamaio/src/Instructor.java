public class Instructor extends User {

    private String[] givenCourseNames;
    private String speciality;
    private String[] experiences;

    public Instructor(){
    }

    public Instructor(String[] givenCourseNames, String speciality, String[] experiences){
        this.givenCourseNames = givenCourseNames;
        this.speciality = speciality;
        this.experiences = experiences;
    }

    public String[] getGivenCourseNames() {
        return givenCourseNames;
    }

    public void setGivenCourseNames(String[] givenCourseNames) {
        this.givenCourseNames = givenCourseNames;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String[] getExperiences() {
        return experiences;
    }

    public void setExperiences(String[] experiences) {
        this.experiences = experiences;
    }
}
