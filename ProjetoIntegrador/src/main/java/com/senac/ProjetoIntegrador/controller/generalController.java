package com.senac.ProjetoIntegrador.controller;

import com.senac.ProjetoIntegrador.data.ClienteEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import com.senac.ProjetoIntegrador.service.ClienteService;

@Controller
public class generalController {

    @Autowired
    ClienteService clienteService;


    @GetMapping("/home")
    public String exibirHome() {
        return "paginaInicial";
    }

    @GetMapping("/contatos")
    public String exibirFormContatos(Model model) {
        model.addAttribute("cliente", new ClienteEntity());
        return "contatos";
    }

    @GetMapping("/portfolio")
    public String exibirPortfolio() {
        return "portfolio";
    }

    @PostMapping("/registroContato")
    public String cadastraContato(@ModelAttribute ClienteEntity cliente, Model model) {
            clienteService.cadastrarCliente(cliente);
            return "redirect:/contatos";
        }
    }


