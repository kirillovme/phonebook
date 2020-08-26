package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileFinding {
    ArrayList<String> arrayList = new ArrayList<>();

    public fileFinding(String filePath) {
        ArrayList<String> tempList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                line = line.replaceAll("\\s+","");
                tempList.add(line);
            }
            this.arrayList = tempList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
