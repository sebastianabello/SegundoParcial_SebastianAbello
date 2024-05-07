package org.example.domain;

import org.example.service.LogStrategy;

public class DatabaseLogStrategy implements LogStrategy {

    @Override
    public void logError(String error) {
        throw new UnsupportedOperationException("No se ha implementado la funcionalidad para almacenar los datos: " + error);
    }
}
