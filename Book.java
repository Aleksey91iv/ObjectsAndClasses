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
}
