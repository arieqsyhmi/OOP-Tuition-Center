import java.util.*;

class Tutor {
    String name;
    String IC;
    String address;
    String qualification;
    int yearExp;
    Date dateJoined;
    int yearsInCenter;

    public Tutor(String name, String IC, String address, String qualification, int yearExp, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearExp = yearExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    public String getQualification() {
        return qualification;
    }
}