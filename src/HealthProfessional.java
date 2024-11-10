public class HealthProfessional {
        private int ID;
        private String name;
        private String specialization;



        public HealthProfessional() {

        }

        public HealthProfessional(int ID, String name, String specialization) {
            this.ID = ID;
            this.name = name;
            this.specialization = specialization;
        }

        public void displayInfo() {
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
        }
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
