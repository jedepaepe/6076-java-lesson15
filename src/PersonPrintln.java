import java.time.Year;

public class PersonPrintln {
    private String identifier;
    private String firstName;
    private String lastName;
    private String email;
    private int birthYear;

    public String getIdentifier() {
        System.out.println("getIdentifier retourne " + identifier);
        return identifier;
    }

    public void setIdentifier(String identifier) {
        System.out.println("setIdentifier, ancienne valeur: " + this.identifier + ", nouvelle valeur: " + identifier);
        this.identifier = identifier;
    }

    public String getFirstName() {
        System.out.println("getFirstName retourne " + firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("setFirstName, ancienne valeur: " + this.firstName + ", nouvelle valeur: " + firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("getLastName retourne " + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("setLastName, ancienne valeur: " + this.lastName + ", nouvelle valeur: " + lastName);
        this.lastName = lastName;
    }

    public String getEmail() {
        System.out.println("getEmail retourne " + email);
        return email;
    }

    public void setEmail(String email) {
        System.out.println("setEmail, ancienne valeur " + this.email + ", nouvelle valeur: " + email);
        this.email = email;
    }

    public int getBirthYear() {
        System.out.println("getBirthYear retourne " + birthYear);
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        System.out.println("setBirthYear, ancienne valeur " + this.birthYear + ", nouvelle valeur: " + birthYear);
        this.birthYear = birthYear;
    }

    public int getAge() {
        int age = Year.now().getValue() - birthYear;
        System.out.println("getAge retourne " + age);
        return age;
    }

    public boolean equals(PersonPrintln other) {
        return identifier.equals(other.identifier);
    }
}
