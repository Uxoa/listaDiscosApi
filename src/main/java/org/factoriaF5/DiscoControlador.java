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
    public List<Disco> verTodosLosDiscos(@PathVariable Long id){
        this.discoRepositorio.findAll();
        return (List<Disco>) discoRepositorio;
    }
    
    @GetMapping("{id}")
    public Disco buscarDiscoPorId(){
        
        return null;
    }
    
    @DeleteMapping("{id}")
    public void borrarDiscoPorId(@PathVariable Long id){
        this.discoRepositorio.deleteById(id);
    }
    
    
    
}
