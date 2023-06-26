
package com.arboles.service;

import java.util.List;
import com.arboles.entities.Arbol;

public interface IArbolService {
     List<Arbol> getAllProducts();

    void save(Arbol arbol);

    void delete(Arbol arbol);
    
}
