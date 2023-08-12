
public class Userdata {
    private String lastName;
    private String firstName;
    private String fatherName;
    private String birthDate;
    private String phoneNumber;
    private char gender;

    public Userdata(String lastName, String firstName, String fatherName, String birthDate, String phoneNumber,
            char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<" + lastName + ">");
        stringBuilder.append("<" + firstName + ">");
        stringBuilder.append("<" + fatherName + ">");
        stringBuilder.append("<" + birthDate + ">");
        stringBuilder.append("<" + phoneNumber + ">");
        stringBuilder.append("<" + gender + ">");


        return stringBuilder.toString();
    }
}