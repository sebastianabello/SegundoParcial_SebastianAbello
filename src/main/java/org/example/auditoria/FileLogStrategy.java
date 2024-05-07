package org.example.auditoria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogStrategy implements LogStrategy {
    @Override
    public void logError(String error) {
        try (FileWriter fileWriter = new FileWriter("log.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(error);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo de log", e);
        }
    }
}
