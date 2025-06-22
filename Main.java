//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты и классы.\n");

        try {
            Librarian librarian = new Librarian();
            librarian.createBooks();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}