import java.util.ArrayList;

//Create the main class Assign One to run the entire program.
public class AssignmentOne {
    public static void main(String[] args) {


        // Part 3 – Using classes and objects

        //Create three general practitioner clients
        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1, "Lian Li", "Pediatrics", "Liuzhou People's Hospital");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Da Zhu", "Otolaryngology", "Liuzhou Traditional Chinese Medicine Hospital");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Jun Liu", "Department of stomatology", "Liuzhou People's Hospital");

        //Create three surgeon objects
        HealthProfessional surgeon1 = new Surgeon(4, "Xiangbo Zeng", "Craniotomy", 124);
        Surgeon surgeon2 = new Surgeon(5, "Lihong Xiao", "Orthopedic Surgery", 287);
        Surgeon surgeon3 = new Surgeon(6,"Xin Chen","Neurosurgery",168);


        //Print information of general practitioners
        generalPractitioner1.displayInfo();
        System.out.println("------------------------------");
        generalPractitioner2.displayInfo();
        System.out.println("------------------------------");
        generalPractitioner3.displayInfo();
        System.out.println("------------------------------");


        //Print surgeon's information
        surgeon1.displayInfo();
        System.out.println("------------------------------");
        surgeon2.displayInfo();
        System.out.println("------------------------------");
        surgeon3.displayInfo();
        System.out.println("------------------------------");







        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();


        //Create four appointments and add them to the collection
        createAppointment(appointments, new Patient("Shuang Zhang", "13001258707", 30, "2893464201@qq.com"), "10:25", generalPractitioner1);
        createAppointment(appointments, new Patient("Tao Zhou", "13716376774", 28, "2464584423@qq.com"), "14:17", surgeon1);
        createAppointment(appointments, new Patient("Le Chang", "13701268707", 29, "2896434321@qq.com"), "09:06", generalPractitioner2);
        createAppointment(appointments, new Patient("Jing Xv", "13910151196", 42, "2456584430@qq.com"), "15:27", surgeon2);


        //Print all existing appointments
        printExistingAppointments(appointments);
        System.out.println("------------------------------");


        //Cancel the appointment with the specified phone number
        cancelBooking(appointments, "13716376774");
        System.out.println("------------------------------");


        //Print existing appointments
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }


    /*
     *Method for creating appointments and adding them to a collection.
     *This method is used to create a new appointment instance based on the provided patient information, time period, and doctor,
     *And add it to the reservation set. If any input information is invalid, the method will output an error message.
     */
    public static void createAppointment(ArrayList<Appointment> appointments, Patient patient, String timeSlot, HealthProfessional doctor) {
        if (patient != null && timeSlot != null && !timeSlot.isEmpty() && doctor != null) {
            Appointment appointment = new Appointment(patient, timeSlot, doctor);
            appointments.add(appointment);
            System.out.println("Appointment created for " + patient.getName() + " with " + doctor.getName() + " at " + timeSlot);
        } else {
            System.out.println("Sorry, you are missing information and unable to create an appointment.");
        }
    }


    /*
     *Print the existing appointment method.
     *Traverse the reservation collection and print detailed information for each reservation. If the set is empty, output a prompt message.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("Sorry,No existing appointments.");
        } else {
            System.out.println("Existing appointments:");
            for (int i = 0 ;i < appointments.size(); i++) {
                Appointment appointment = appointments.get(i);
                appointment.displayAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }


    /*
     *The method of canceling an appointment based on the patient's phone number.
     *Traverse the appointment collection to find patient appointments that match the specified phone number. If found, remove the corresponding reservation and output a message indicating successful cancellation.
     *If no matching appointment is found, output a prompt message.
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatient().getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment with patient " + mobilePhone + " has been cancelled.");
                break;
            }
            if (i == appointments.size()-1){
                System.out.println("Error: No appointment found for patient with mobile phone " + mobilePhone);
            }
        }
    }
}
