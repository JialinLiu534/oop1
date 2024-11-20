package src;

import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        HealthProfessional gp1 = new GeneralPractitioner(101, "Dr. Jack", true);
        HealthProfessional gp2 = new GeneralPractitioner(102, "Dr. Johnson", false);
        HealthProfessional gp3 = new GeneralPractitioner(103, "Dr. Lily", true);

        HealthProfessional diet1 = new Dietitian(201, "Dr. White", true);
        HealthProfessional diet2 = new Dietitian(202, "Dr. Green", false);

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();

        diet1.printDetails();
        diet2.printDetails();

        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "Alice", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Bob", "9876543210", "10:00", gp2);
        createAppointment(appointments, "Charlie", "12342334567", "14:30", diet1);
        createAppointment(appointments, "Diana", "65343323", "16:00", diet2);
        printExistingAppointments(appointments);

        // Cancel booking
        System.out.println("Cancel booking \"Bob\", \"9876543210\", \"10:00\"\n");
        if (!cancelBooking(appointments, "9876543210")) {
            System.out.println("Error, the mobile phone is not found in the existing appointment.");
        } else {
            System.out.println("Cancel success!");
        }
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> appointments, String name, String phone, String timeSlot, HealthProfessional doctor) {
        if (name.isEmpty() || phone.isEmpty() || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Invalid appointment details.");
            return;
        }
        appointments.add(new Appointment(name, phone, timeSlot, doctor));
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.printDetails();
        }
    }

    public static boolean cancelBooking(ArrayList<Appointment> appointments, String phone) {
        for (Appointment appointment : appointments) {
            if(appointment.getPhone().equals(phone)){
                appointments.remove(appointment);
                return true;
            }
        }
        return false;
    }
}
