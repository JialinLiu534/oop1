package src;

public class HealthProfessional {
    private int id;
    private String name;
    private String information;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.information = "Null";
    }

    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.information = specialty;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Information: " + information);
    }
}

