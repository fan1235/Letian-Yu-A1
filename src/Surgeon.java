//Create Surgeon class, inherit HealthProfessional class
public class Surgeon extends HealthProfessional {
    private int surgeriesNumbers;
    //No parameter constructor
    public Surgeon() {
        super();
    }
    //Using the geter seter method to output and input information
    public int getSurgeriesNumbers() {
        return surgeriesNumbers;
    }

    public void setSurgeriesNumbers(int surgeriesNumbers) {
        this.surgeriesNumbers = surgeriesNumbers;
    }
    //The fully parameterized construction method is used to initialize all attributes of the surgeon
    public Surgeon(int ID, String name, String specialization, int surgeriesNumbers) {
        super(ID, name, specialization);
        this.surgeriesNumbers = surgeriesNumbers;
    }
    //Rewrite the display Info method of the parent class
    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo(); //Call the showInfo method of the parent class
        System.out.println("Type: Surgeon");
        System.out.println("Surgeries Numbers: " + surgeriesNumbers);
    }
}

