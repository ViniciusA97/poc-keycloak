package com.demo.keycloak.keycloak.application.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api/client")
public class ClientResourse {

    @GetMapping
    public ResponseEntity<?> getClients(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/secured")
    public ResponseEntity<?> getClientsSecured(){
        return ResponseEntity.ok("This is a secured resource");
    }

    @GetMapping("/admin-secured")
    public ResponseEntity<?> getAdminSecured(){
        return ResponseEntity.ok("This is a admin secured resource");
    }

    @GetMapping("/open-secured")
    public ResponseEntity<?> getOpenSecured(){
        return ResponseEntity.ok("This is a Open secured resource");
    }

}
