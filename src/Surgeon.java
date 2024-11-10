public class Surgeon extends HealthProfessional {
    private String surgeriesNumber;

    public Surgeon() {
        super();
    }

    public String getSurgeriesNumber() {
        return surgeriesNumber;
    }

    public void setSurgeriesNumber(String surgeriesNumber) {
        this.surgeriesNumber = surgeriesNumber;
    }

    public Surgeon(int ID, String name, String specialization, String surgeriesNumber) {
        super(ID, name, specialization);
        this.surgeriesNumber = surgeriesNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo();
        System.out.println("Type: Surgeon");
        System.out.println("Surgeries Number: " + surgeriesNumber);
    }
}

