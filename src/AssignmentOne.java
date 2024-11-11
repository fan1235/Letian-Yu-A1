public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects


        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1, "Lian Li", "Pediatrics", "Liuzhou People's Hospital");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Da Zhu", "Otolaryngology", "Liuzhou Traditional Chinese Medicine Hospital");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Jun Liu", "Department of stomatology", "Liuzhou People's Hospital");


        HealthProfessional surgeon1 = new Surgeon(4, "Xiangbo Zeng", "Craniotomy", 124);
        Surgeon surgeon2 = new Surgeon(5, "Lihong Xiao", "Orthopedic Surgery", 287);
        Surgeon surgeon3 = new Surgeon(6,"Xin Chen","Neurosurgery",168);


        generalPractitioner1.displayInfo();
        System.out.println("------------------------------");
        generalPractitioner2.displayInfo();
        System.out.println("------------------------------");
        generalPractitioner3.displayInfo();
        System.out.println("------------------------------");


        surgeon1.displayInfo();
        System.out.println("------------------------------");
        surgeon2.displayInfo();
        System.out.println("------------------------------");
        surgeon3.displayInfo();
        System.out.println("------------------------------");
    }
}
