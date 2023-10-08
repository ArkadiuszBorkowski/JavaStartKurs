package EnkapsulacjaHermetyzacja.cw1;

public class Client {
    private String firstName;
    private String lastName;
    private Boolean clientPremium;

    public Client(String firstName, String lastName, Boolean clientPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientPremium = clientPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getClientPremium() {
        return clientPremium;
    }

    public void setClientPremium(Boolean clientPremium) {
        this.clientPremium = clientPremium;
    }

    public boolean isPremium() {
        return clientPremium;
    }
}
