//Create Appointment Class
public class Appointment {

    private Patient patient;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    //Using the geter seter method to output and input information
    public Patient getPatient() {
        return patient;
    }


    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    //No parameter constructor
    public Appointment() {

    }


    //The fully parameterized construction method is used to initialize all the information of the reservation
    public Appointment(Patient patient, String timeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }


    /*
     *Method for printing appointment details.
     *This method sequentially outputs the patient information, appointment time period, and doctor information included in the appointment.
     *If the patient or doctor information is not set, the corresponding prompt message will be displayed.
     */
    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        if (patient != null) {
            patient.displayPatientInfo();
        }
        System.out.println("Preferred Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (selectedDoctor != null) {
            selectedDoctor.displayInfo();
        } else {
            System.out.println("Sorry, you haven't designated a doctor");
        }
    }
}
