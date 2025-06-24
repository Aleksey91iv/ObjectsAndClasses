class Book {

    private String title;
    private Author author;
    int publicationYear;

    Book(String title, Author author, int publicationYear) {
        if (title.isBlank() || author == null) {
            throw new IllegalArgumentException("Формат название книги некорректный.");
        }

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }

    int getPublicationYear() {
        return publicationYear;
    }

    void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: \"" + title + "\"\nАвтор: " + author.toString() + "\n" + "Год издания: " + publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book book) {
            return title.equals(book.title) && publicationYear == book.publicationYear && author.equals(book.author);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (title + publicationYear + author.getFirstName() + author.getLastName()).hashCode();
    }
}
