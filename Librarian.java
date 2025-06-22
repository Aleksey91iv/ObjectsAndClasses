class Librarian {


    // Принять книги по накладной.
    void createBooks() {
        Author russianGreatAuthor = new Author("Фёдор", "Достоевский");
        Author usaGreatAuthor = new Author("Jack", "London");

        Book russianBook = new Book("Идиот", russianGreatAuthor, 1868);

        System.out.printf("Название: %s\t Автор: \"%s %s\",\t Дата публикации: %d\n",
                russianBook.getTitle(),
                russianBook.getAuthor().getFirstName(),
                russianBook.getAuthor().getLastName(),
                russianBook.getPublicationYear());

        Book usaBook = new Book("Martin Iden", usaGreatAuthor, 1908);

        System.out.printf("Название: %s\t Автор: \"%s %s\",\t Дата публикации: %d\n",
            usaBook.getTitle(),
            usaBook.getAuthor().getFirstName(),
            usaBook.getAuthor().getLastName(),
            usaBook.getPublicationYear());

        System.out.println("\nИзменение года публикации книги " + usaBook.getTitle() + ".");

        usaBook.setPublicationYear(2015);
        System.out.printf("Название: %s\t Автор: \"%s %s\",\t Дата публикации: %d\n",
                usaBook.getTitle(),
                usaBook.getAuthor().getFirstName(),
                usaBook.getAuthor().getLastName(),
                usaBook.getPublicationYear());
    }
}
