package org.example.auditoria;

public class AuditModule {
    private LogStrategy logStrategy;

    public AuditModule(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void setLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void performAction() {
        try {
            // Aquí va la implementación de la acción
        } catch (Exception e) {
            logStrategy.logError(e.getMessage());
        }
    }
}
