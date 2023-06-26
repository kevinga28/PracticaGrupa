
package com.arboles.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.arboles.db.IArbolRepository;
import com.arboles.entities.Arbol;
import com.arboles.service.IArbolService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArbolService implements IArbolService{


    private final IArbolRepository arbolRepository;

    public ArbolService(IArbolRepository arbolRepository) {
        this.arbolRepository = arbolRepository;
    }

    
    public List<Arbol> getAllArbol() {
        return (List<Arbol>) this.arbolRepository.findAll();
    }

    public void save(Arbol arbol) {
        arbol.setActivo(true);
        this.arbolRepository.save(arbol);
    }

    public void delete(Arbol arbol) {
        this.arbolRepository.delete(arbol);
    } 
}
