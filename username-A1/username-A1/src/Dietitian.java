package src;

public class Dietitian extends HealthProfessional {
    private boolean onlineBookings;

    public Dietitian() {
        super();
        this.onlineBookings = true;
    }

    public Dietitian(int id, String name, boolean onlineBookings) {
        super(id, name, "Dietitian");
        this.onlineBookings = onlineBookings;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("No online bookings: " + onlineBookings);
        System.out.println();
    }
}
