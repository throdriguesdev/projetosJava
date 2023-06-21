public class Student {
    private String name;
    private Double[]  grades;

    public Student(String name, Double[] grades) {
    this.name = name;
    this.grades = grades;
    }
    public  String getName() {
        return name;
    }
    public Double[] getGrades() {
        return grades;
    }
    public void setGrades(Double[] grades) {
        this.grades = grades;
    }
    public double calculateAverage() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}



