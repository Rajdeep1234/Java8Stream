public class Courses {
    private String name;
    private String category;
    private int reviewCount;
    private int noOfStudents;

    public Courses(String name, String category, int reviewCount, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewCount = reviewCount;
        this.noOfStudents = noOfStudents;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", reviewCount=" + reviewCount +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}
