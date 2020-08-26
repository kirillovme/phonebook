package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class fileReading {
    HashMap<String, String> numbers;

    public fileReading(String filepath) {
        HashMap<String, String> temp = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File(filepath));
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] tempmas = line.split("\\s+");
                String fullname = "";
                try {
                    fullname = tempmas[1] + tempmas[2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    fullname = tempmas[1];
                }
                temp.put(tempmas[0], fullname);
                this.numbers = temp;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
