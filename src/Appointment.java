public class Appointment {

    private Patient patient;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

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

    public Appointment() {

    }


    public Appointment(Patient patient, String timeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }


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
            System.out.println("No doctor assigned.");
        }
    }
}
