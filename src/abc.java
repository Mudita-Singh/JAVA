import java.io.File;
import java.io.IOException;

class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\TestFiles\\abc.txt");

        if (f.createNewFile()) {
            System.out.println("File created successfully: " + f.getAbsolutePath());
        } else {
            System.out.println("File already exists.");
        }
    }
}
