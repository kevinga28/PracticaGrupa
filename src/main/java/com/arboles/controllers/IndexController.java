/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arboles.controllers;
import com.arboles.service.IArbolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    private final IArbolService productService;

    public IndexController(IArbolService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var productos = this.productService.getAllProducts();
        model.addAttribute("products", productos);
        return "index";
    }
}