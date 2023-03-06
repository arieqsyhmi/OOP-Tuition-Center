import java.util.*;

class Student {
    String name;
    String IC;
    String address;
    int year;
    String schoolName;
    List<Double> scores;

    public Student(String name, String IC, String address, int year, String schoolName, List<Double> scores) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    public double getAvgScore() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public double getMinScore() {
        double min = Double.MAX_VALUE;
        for (double score : scores) {
            min = Math.min(min, score);
        }
        return min;
    }

    public double getMaxScore() {
        double max = Double.MIN_VALUE;
        for (double score : scores) {
            max = Math.max(max, score);
        }
        return max;
    }
}