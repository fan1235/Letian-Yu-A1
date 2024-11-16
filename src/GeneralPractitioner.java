//Create a GeneralPractitioner class that inherits from the HealthProfessional class
public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    //No parameter constructor
    public GeneralPractitioner() {
        super();
    }
    //Using the geter seter method to output and input information
    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }

    //Fully parameterized constructor, used to initialize all properties of a general practitioner
    public GeneralPractitioner(int ID, String name, String specialization, String clinicLocation) {
        super(ID, name, specialization);  //Call the fully parameterized constructor method of the parent class
        this.clinicLocation = clinicLocation;
    }
    //Rewrite the display Info method of the parent class
    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo(); //Call the showInfo method of the parent class
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic Location: " + clinicLocation);
    }
}

