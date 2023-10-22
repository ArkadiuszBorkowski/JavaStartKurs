package Object.cw2;

import java.util.Objects;

class Client {
    private String firstName;
    private String lastName;
    private String id;
    private Address address;

    public Client(String firstName, String lastName, String id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return firstName.equals(client.firstName) &&
                lastName.equals(client.lastName) &&
                id.equals(client.id) &&
                address.equals(client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, address);
    }
}