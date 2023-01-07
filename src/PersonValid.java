public class PersonValid {
    private String identifier;
    private String firstName;
    private String lastName;
    private String email;
    private int birthYear;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("identifier is null");
        }
        if (identifier.length() != 11) {
            throw new IllegalArgumentException("identifier must have exactly 11 chars");
        }
        for (int i = 0; i < identifier.length(); ++i) {
            if ('0' > identifier.charAt(i) || identifier.charAt(i) > '9') {
                throw new IllegalArgumentException(identifier + " must contain only digit");
            }
        }
        int year = Integer.parseInt(identifier.substring(0, 2));
        int month = Integer.parseInt(identifier.substring(2, 4));
        if (1 > month || month > 12) {
            throw new IllegalArgumentException(identifier + ", month must be between 01-12");
        }
        int day = Integer.parseInt(identifier.substring(4, 6));
        if (1 > day || day > 31) {
            throw new IllegalArgumentException(identifier + ", day must be between 01-31");
        }
        if (month % 2 == 0 && day > 30) {
            throw new IllegalArgumentException(identifier + ", day of month " + month + " must be <= 30");
        }
        if (month == 2 && year % 4 == 0 && day > 29) {
            throw  new IllegalArgumentException(identifier + ", day of bisextile February must be <= 29");
        }
        if (month == 2 && year %4 != 0 && day > 28) {
            throw  new IllegalArgumentException(identifier + ", day of February must be <= 28");
        }
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("firstName is null");
        }
        if (firstName.length() < 2 || firstName.length() > 50) {
            throw new IllegalArgumentException(firstName + " must have 2-50 chars");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("lastName is null");
        }
        if (lastName.length() < 2 || lastName.length() > 50) {
            throw new IllegalArgumentException(lastName + " must have 2-50 chars");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw  new IllegalArgumentException("email is null");
        }
        int arobatCount = email.length() - email.replaceAll("@", "").length();
        if (arobatCount != 1) {
            throw  new IllegalArgumentException(email + " must contain one @");
        }
        int arobatIndex = email.indexOf('@');
        int dotLastIndex = email.lastIndexOf('.');
        if (dotLastIndex < arobatIndex) {
            throw new IllegalArgumentException(email + " must containt a dot . after @");
        }
        // other rules for email
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 1500) {
            throw new IllegalArgumentException(birthYear + " must be > 1500");
        }
        String year = "" + birthYear;
        year = year.substring(year.length() - 2);
        if (! year.equals(identifier.substring(0, 2))) {
            throw new IllegalArgumentException(year + " is not coherent with identifier " + identifier);
        }
        this.birthYear = birthYear;
    }
}
