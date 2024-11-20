package src;

public class GeneralPractitioner extends HealthProfessional {
    private boolean afterHoursConsult;

    public GeneralPractitioner() {
        super();
        this.afterHoursConsult = false;
    }

    public GeneralPractitioner(int id, String name, boolean afterHoursConsult) {
        super(id, name, "General Practitioner");
        this.afterHoursConsult = afterHoursConsult;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Provides afterHoursConsult: " + afterHoursConsult);
        System.out.println();
    }
}
