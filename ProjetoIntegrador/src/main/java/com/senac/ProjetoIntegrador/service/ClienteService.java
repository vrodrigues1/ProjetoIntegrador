package com.senac.ProjetoIntegrador.service;

import com.senac.ProjetoIntegrador.data.ClienteEntity;
import com.senac.ProjetoIntegrador.data.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteEntity cadastrarCliente(ClienteEntity cliente){

        cliente.setId(null);
        clienteRepository.save(cliente);
        return cliente;
    }

}
