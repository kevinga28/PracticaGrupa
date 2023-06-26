
package com.arboles.controllers;

import com.arboles.entities.Arbol;
import com.arboles.service.IArbolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    private final IArbolService ArbolService;

    public IndexController(IArbolService ArbolService) {
        this.ArbolService = ArbolService;
    }

    @GetMapping("/")
    public String index(Model model) {
        //En esta variable de productos, estan todos los objetos ed la lista de productos
        var arboles = this.ArbolService.getAllArbol();
        model.addAttribute("arboles", arboles);
        return "index";
    }
}