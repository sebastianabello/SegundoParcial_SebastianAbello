package org.example.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogStrategy implements LogStrategy {
    @Override
    public void logError(String error) {
        String logFilePath = "./log.txt";
        File logFile = new File(logFilePath);
        File logDirectory = new File(logFile.getParent());

        if (!logDirectory.exists()) {
            logDirectory.mkdirs();
        }

        try (FileWriter fileWriter = new FileWriter(logFile, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(error);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo de log", e);
        }
    }
}
