/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arboles.controllers;

import com.arboles.entities.Arbol;
import com.arboles.service.IArbolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ArbolController {
    private final IArbolService arbolService;

    public ArbolController(IArbolService arbolService) {
        this.arbolService = arbolService;
    }

    @GetMapping("/arbol")
    public String index(Model model) {

        model.addAttribute("arbol", new Arbol());
        model.addAttribute("arboles", this.arbolService.getAllProducts());
        return "arbol";
    }

    @PostMapping("arbol/save")
    public String save(@ModelAttribute("product") Arbol product) {
        this.arbolService.save(product);
        return "redirect:/arbol";
    }

    @PostMapping("arbol/delete")
    public ResponseEntity<String> delete(@RequestBody Arbol product) {
        this.arbolService.delete(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
