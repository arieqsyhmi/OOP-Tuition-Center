
import java.util.*;

public class PandaiSdnBhd {
    List<Center> centers;

    public PandaiSdnBhd() {
        this.centers = new ArrayList<>();
    }

    public void addCenter(Center center) {
        centers.add(center);
    }

    public Center getCenter(int index) {
        return centers.get(index);
    }

    public int getNumCenters() {
        return centers.size();
}

public static void main(String[] args) {
   
    PandaiSdnBhd pandai = new PandaiSdnBhd();

    // produced data for centers, tutors, and students
    Center center1 = new Center("KL Center", "Fadhil");
    Tutor tutor1 = new Tutor("Adila", "950424078364", "Kuala Lumpur", "PhD", 5, new Date(), 2);
    Tutor tutor2 = new Tutor("Izzat", "971202030642", "Kuala Lumpur", "Master", 3, new Date(), 1);
    Student student1 = new Student("Adlin", "030613157318", "Kuala Lumpur", 2023, "Victoria High Schools", Arrays.asList(96.0, 86.0, 78.0));
    Student student2 = new Student("Sarah", "020430081234", "Kuala Lumpur", 2023, "Sri Utama Schools", Arrays.asList(90.0, 84.5, 92.0));
    center1.addTutor(tutor1);
    center1.addTutor(tutor2);
    center1.addStudent(student1);
    center1.addStudent(student2);
    pandai.addCenter(center1);

    Center center2 = new Center("JB Center", "Rokkiah");
    Tutor tutor3 = new Tutor("Syed", "940126147394", "Johor Bahru", "PhD", 4, new Date(), 1);
    Tutor tutor4 = new Tutor("Imran", "951005111834", "Johor Bahru", "Master", 2, new Date(), 3);
    Student student3 = new Student("Wan", "050328671748", "Johor Bahru", 2023, "SMK Taman Desa Tebrau", Arrays.asList(83.0, 79.0, 85.0));
    Student student4 = new Student("Tom", "030817030658", "Johor Bahru", 2023, "Mohd Khalid Secondary School", Arrays.asList(89.5, 73.0, 97.5));
    center2.addTutor(tutor3);
    center2.addTutor(tutor4);
    center2.addStudent(student3);
    center2.addStudent(student4);
    pandai.addCenter(center2);

    // displaying performance report for each center
    for (int i = 0; i < pandai.getNumCenters(); i++) {
        Center center = pandai.getCenter(i);
        System.out.println("Center " + (i + 1) + ": " + center.address);
        System.out.println("Number of Tutors: " + center.getNumTutors());
        System.out.println("Number of Students: " + center.getNumStudents());
        System.out.println("Average marks: " + center.getAvgMarks());
        System.out.println("Minimum marks: " + center.getMinMarks());
        System.out.println("Maximum marks: " + center.getMaxMarks());
        System.out.println("Tutor backgrounds: " + center.getTutorBackground());
        System.out.println();
    }
}
}
