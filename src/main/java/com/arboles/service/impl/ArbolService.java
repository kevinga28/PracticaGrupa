
package com.arboles.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.arboles.db.IArbolRepository;
import com.arboles.entities.Arbol;
import com.arboles.service.IArbolService;
import org.springframework.stereotype.Service;

import java.util.List;
public class ArbolService {


@Service
public class ProductService implements IArbolService {

    private final IArbolRepository productRepository;

    public ProductService(IArbolRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Arbol> getAllProducts() {
        return (List<Arbol>) this.productRepository.findAll();
    }

    public void save(Arbol arbol) {
        arbol.setActivo(true);
        this.productRepository.save(arbol);
    }

    public void delete(Arbol arbol) {
        this.productRepository.delete(arbol);
    }
}

    
}
