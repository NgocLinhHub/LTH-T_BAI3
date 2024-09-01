package iuh.fit.se;

public class CourseList  {
    private Course[] courses;
    private static int count = 0;
    /**
     * Description: Constructor with a parameter to initialize the array of courses with a specific length n
     * @param n The length of the array
     * @throws IllegalArgumentException if n is less than or equal to 0
     */

    public CourseList(int n) {
        if(n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n];

    }
    /**
     * Description: Add a course to the list
     * @return true if the course is added successfully, false otherwise
     * @throws IllegalArgumentException if the course is null, the course already exists, or the array is full
     */
    public boolean addCourse(Course course) {
 //check if course is null
        if(course == null)
            return false;
 //check if course already exist
        if(exists(course))
            return false;
 //
        courses[count++] = course;
        return true;
    }
    private boolean exists(Course course) {
        for (int i = 0; i < count; i++) {
            if(courses[i] != null && courses[i].getId().equals(course.getId()))
                return true;
        }
        return false;
    }
    public Course[] getCourse() {
        return courses;
    }
}
