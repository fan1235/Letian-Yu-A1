public class Surgeon extends HealthProfessional {
    private int surgeriesNumbers;

    public Surgeon() {
        super();
    }

    public int getSurgeriesNumbers() {
        return surgeriesNumbers;
    }

    public void setSurgeriesNumbers(int surgeriesNumbers) {
        this.surgeriesNumbers = surgeriesNumbers;
    }

    public Surgeon(int ID, String name, String specialization, int surgeriesNumbers) {
        super(ID, name, specialization);
        this.surgeriesNumbers = surgeriesNumbers;
    }

    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo();
        System.out.println("Type: Surgeon");
        System.out.println("Surgeries Numbers: " + surgeriesNumbers);
    }
}

