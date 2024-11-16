//Create a Patient class
public class Patient {

    private String name;
    private String mobilePhone;
    private int age;
    private String email;


    //No parameter constructor
    public Patient() {

    }

    //The fully parameterized construction method is used to initialize all patient information
    public Patient(String name, String mobilePhone, int age, String email) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.age = age;
        this.email = email;
    }


    //Using the geter seter method to output and input information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Print patient information
    public void displayPatientInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
