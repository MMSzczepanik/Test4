package SDA;

public class Employe {
    private String nsme;
    private String lastName;

    public Employe(String nsme, String lastName) {
        this.nsme = nsme;
        this.lastName = lastName;
    }

    public String getNsme() {
        return nsme;
    }

    public void setNsme(String nsme) {
        this.nsme = nsme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nsme='" + nsme + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
