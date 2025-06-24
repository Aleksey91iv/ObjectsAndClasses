class Librarian {

    // Принять книги по накладной.
    void createBooks() {
        Author russianGreatAuthor = new Author("Фёдор", "Достоевский");
        Book russianBook = new Book("Идиот", russianGreatAuthor, 1868);

        Author usaGreatAuthor = new Author("Jack", "London");
        Book usaBook = new Book("Martin Iden", usaGreatAuthor, 1908);

        System.out.println("----------------------------");
        System.out.println(russianBook);
        System.out.println("----------------------------");
        System.out.println(usaBook);
        System.out.println("----------------------------");

        System.out.println("\nИзменение года публикации книги " + usaBook.getTitle() + ".");

        usaBook.setPublicationYear(2015);
        System.out.println(usaBook);
    }
}
