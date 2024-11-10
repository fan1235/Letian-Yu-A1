public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    public GeneralPractitioner() {
        super();
    }

    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }

    public GeneralPractitioner(int ID, String name, String specialization, String clinicLocation) {
        super(ID, name, specialization);
        this.clinicLocation = clinicLocation;
    }

    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo();
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic Location: " + clinicLocation);
    }
}

