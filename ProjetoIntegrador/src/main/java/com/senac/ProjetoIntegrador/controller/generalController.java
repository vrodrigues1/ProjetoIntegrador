package com.senac.ProjetoIntegrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class generalController {

    @GetMapping ("/home")
    public String exibirHome() {
        return "paginaInicial" ;
    }

    @GetMapping("/contatos")
    public String exibirFormContatos(){
        return "contatos" ;
    }

    @GetMapping("/portfolio")
    public String exibirPortfolio(){
        return "portfolio";
    }

    @PostMapping("/registroContato")
    public String cadastraContato(){
        return "redirect:/contatos";
    }
}
