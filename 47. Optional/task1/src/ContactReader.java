import javax.swing.text.html.Option;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

class ContactReader {
    static Optional<ContactManager> readFile(String fileName) {
        ContactManager contactManager = null;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            contactManager = new ContactManager();
            while (scanner.hasNextLine()) {
                Contact contact = createContactFromText(scanner.nextLine());
                contactManager.addContact(contact);
            }
            return Optional.of(contactManager);
        } catch (FileNotFoundException e) {
            return Optional.empty();
        }
    }

    private static Contact createContactFromText(String text) {
        String[] data = text.split(";");
        return new Contact(data[0], data[1], data[2], data[3]);
    }
}