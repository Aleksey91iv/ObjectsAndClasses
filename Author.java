class Author {
    private String firstName;
    private String lastName;

    Author(String firstName, String lastName) {
        firstName = firstName.trim();
        lastName = lastName.trim();

        boolean isOnlyCyrillic = firstName.matches("^\\p{InCyrillic}+") && lastName.matches("^\\p{InCyrillic}+");
        boolean isOnlyLatinic = firstName.matches("^[A-Za-z]+") && lastName.matches("^[A-Za-z]+");

        if (!isOnlyCyrillic && !isOnlyLatinic) {
            throw new IllegalArgumentException("Фамилия и/или имя автора введены некорректно.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author author) {
            return this.firstName.equals(author.firstName) && this.lastName.equals(author.lastName);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (firstName + lastName).hashCode();
    }
}
