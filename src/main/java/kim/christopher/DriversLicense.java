package kim.christopher;

import java.util.ArrayList;

public class DriversLicense {

    private String lastName;
    private String firstName;
    private String streetAddress;
    private String state;
    private String licenseNumber;
    private String dateOfBirth;
    private String issueDate;
    private String expirationDate;
    private String sex;
    private String eyeColor;
    private String height;
    private String organDonor;
    private String licenseClass;

    public DriversLicense(String lastName, String firstName, String streetAddress, String state, String licenseNumber, String dateOfBirth, String issueDate, String expirationDate, String sex, String eyeColor, String height, String organDonor, String licenseClass) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.state = state;
        this.licenseNumber = licenseNumber;
        this.dateOfBirth = dateOfBirth;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.height = height;
        this.organDonor = organDonor;
        this.licenseClass = licenseClass;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getSex() {
        return sex;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public String getOrganDonor() {
        return organDonor;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public static String getCSVHeader(){
        return "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n";
    }

    public static String serializeToCSV(ArrayList<DriversLicense> list){
        
    }
}
