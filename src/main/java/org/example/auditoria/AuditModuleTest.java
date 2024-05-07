package org.example.auditoria;

import org.example.domain.User;
import org.example.service.FileLogStrategy;
import org.example.service.LogStrategy;

import java.io.File;

public class AuditModuleTest {
    public static void main(String[] args) {
        File directory = new File("src/main/resources/QRCode/");
        if (! directory.exists()){
            directory.mkdir();
        }

        LogStrategy fileLogStrategy = new FileLogStrategy();

        AuditModule auditModule = new AuditModule(fileLogStrategy);

        User testUser = new User();
        testUser.setId(1L);
        testUser.setFirstname("Sebastian");
        testUser.setLastname("Gomez");
        testUser.setEmail("45");
        testUser.setMobile("1234567890");

        if (testUser.getFirstname() != null) {
            auditModule.performAction(testUser);
        } else {
            System.out.println("User's name is null");
        }

    }

}
