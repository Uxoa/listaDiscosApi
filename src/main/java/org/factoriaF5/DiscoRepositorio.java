package org.factoriaF5;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscoRepositorio extends JpaRepository<Disco, Long>{
    
    List<Disco> findDiscosByArtista(String artista, Sort sort);
}
