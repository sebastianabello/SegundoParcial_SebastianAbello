package org.example.auditoria;

import org.example.domain.User;
import org.example.service.LogStrategy;
import org.example.utils.QRCodeGenerator;

public class AuditModule {
    private LogStrategy logStrategy;

    public AuditModule(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void setLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void performAction(User user ) {
        if (user.getFirstname() == null || user.getFirstname().isEmpty()) {
            logStrategy.logError("El nombre del usuario es nulo o está vacío");
            return;
        }

        if (user.getLastname() == null || user.getLastname().isEmpty()) {
            logStrategy.logError("El apellido del usuario es nulo o está vacío");
            return;
        }

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            logStrategy.logError("El correo electrónico del usuario es nulo o está vacío");
            return;
        }

        if (user.getMobile() == null || user.getMobile().isEmpty()) {
            logStrategy.logError("El número de móvil del usuario es nulo o está vacío");
            return;
        }

        try {
            QRCodeGenerator.generateQRCode(user);
        } catch (Exception e) {
            logStrategy.logError(e.getMessage());
        }
    }
}
