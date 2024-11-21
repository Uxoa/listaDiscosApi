package org.factoriaF5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discos")
public class DiscoControlador {
    
   @Autowired
   public DiscoRepositorio discoRepositorio;
   
   @PostMapping
   public Disco crearDisco(@RequestBody Disco disco){
       this.discoRepositorio.save(disco);
       return disco;
   }

   @GetMapping
   public List<Disco> verTodosLosDiscos(){
       return discoRepositorio.findAll();
        }

}
