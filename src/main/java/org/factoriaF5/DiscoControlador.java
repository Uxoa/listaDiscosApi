package org.factoriaF5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

   @GetMapping("{id}")
   public Disco verTodosLosDiscos(@PathVariable Long id){
       return null;
   }

}
