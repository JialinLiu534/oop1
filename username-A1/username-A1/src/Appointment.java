package src;

public class Appointment {
    private String patientName;
    private String phone;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this.patientName = "Unknown";
        this.phone = "0000000000";
        this.timeSlot = "Unknown";
        this.doctor = null;
    }

    public Appointment(String patientName, String phone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.phone = phone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getPhone() {
        return phone;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + phone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }
}
