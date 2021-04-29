package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();
        for (String employee : contacts.keySet()) {
            sb.append(employee).append(": ").append(contacts.get(employee)).append("\n");
        }

        try {
            Files.writeString(Path.of(output), sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
