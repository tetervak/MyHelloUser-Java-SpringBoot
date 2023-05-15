package sheridan.tetervak.myhellouser.model;

import jakarta.validation.constraints.NotBlank;

public class AppUser {

    @NotBlank
    private String firstName = "";

    @NotBlank
    private String lastName = "";

    public AppUser() {
    }

    public AppUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
