import java.time.Year;

public class Person2Chars {
    private String identifier;
    private String firstName;
    private String lastName;
    private String email;
    private int birthYear;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() < 2) {
            throw new IllegalArgumentException(firstName + " must have at least 2 chars");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() < 2) {
            throw  new IllegalArgumentException(lastName + " must have at least 2 chars");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public boolean equals(Person2Chars other) {
        return identifier.equals(other.identifier);
    }
}
