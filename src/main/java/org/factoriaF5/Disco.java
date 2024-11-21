package org.factoriaF5;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "disco")
public class Disco {
    
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "nombreDisco")
    private String nombreDisco;
    
}
