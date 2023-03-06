import java.util.*;

class Center {
    String address;
    String headMaster;
    List<Tutor> tutors;
    List<Student> students;

    public Center(String address, String headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getNumTutors() {
        return tutors.size();
    }

    public int getNumStudents() {
        return students.size();
    }

    public double getAvgMarks() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAvgScore();
        }
        return sum / students.size();
    }

    public double getMinMarks() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            min = Math.min(min, student.getMinScore());
        }
        return min;
    }

    public double getMaxMarks() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            max = Math.max(max, student.getMaxScore());
        }
        return max;
    }

    public List<String> getTutorBackground() {
        List<String> backgrounds = new ArrayList<>();
        for (Tutor tutor : tutors) {
            backgrounds.add(tutor.getQualification());
        }
        return backgrounds;
    }
}