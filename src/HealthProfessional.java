//HealthProfessional class: used to represent basic information of medical professionals
public class HealthProfessional {
        private int ID;
        private String name;
        private String specialization;


        // No parameter constructor
        public HealthProfessional() {

        }

        //Fully parameterized construction, used to initialize all attributes of medical professionals
        public HealthProfessional(int ID, String name, String specialization) {
            this.ID = ID;
            this.name = name;
            this.specialization = specialization;
        }

        //Print detailed information of medical professionals
        public void displayInfo() {
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
        }

        //Using the geter seter method to output and input information
        public int getID() {
        return ID;
        }

        public void setID(int ID) {
        this.ID = ID;
        }

        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public String getSpecialization() {
          return specialization;
        }

        public void setSpecialization(String specialization) {
        this.specialization = specialization;
        }
}
