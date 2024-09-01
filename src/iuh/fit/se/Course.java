package iuh.fit.se;


public class Course {
    private String id;
    private String title;
    private int  credits;
    private String department;

    public Course(String id, String title, int credits, String department) {
        if (id == null || id.length() < 3 || !id.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("ID must have at least 3 characters and contain only letters or digits");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        if (credits <= 0) {
            throw new IllegalArgumentException("Credit must be greater than 0");
        }
        this.id = id;
        this.title = title;
        this.credits = credits;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {


        if (id == null || id.trim().length() < 3)
            throw new IllegalArgumentException(" ID must have at least 3 characters");

        int len = id.length();
        for (int i = 0; i < len; i++) {
            char c = id.charAt(i);
            if (!Character.isLetterOrDigit(id.charAt(i)))
                throw new IllegalArgumentException(" ID must contain only letters or digits");
        }

            this.id = id;
    }
    /**
     * Description: Get the title of the course
     * @return The title of the course
     */

    public String getTitle() {
        return title;
    }
    /**
     * Description: Set the title of the course
     * @param title The title of the course
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException(" Title must not be empty");
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }
    /**
     * Description: Set the credit of the course
     * @throws IllegalArgumentException if credit is less than 0
     */
    public void setCredits(int credits) {
        if (credits < 0)
            throw new IllegalArgumentException(" Credits must be greater than 0");
        this.credits = credits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return String.format("%-20s%-40s%2d   %-10s", id, title, credits, department);
    }
}
