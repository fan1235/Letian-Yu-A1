public class HealthProfessional {
        private int ID;
        private String name;
        private String specialization;

        public HealthProfessional() {
            this.ID = 0;
            this.name = "Unknown";
            this.specialization = "General";
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


}
