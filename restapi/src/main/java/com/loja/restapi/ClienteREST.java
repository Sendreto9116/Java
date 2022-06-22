package com.loja.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.restapi.banco.BancoCliente;
import com.loja.restapi.entidade.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteREST {
    @Autowired
    private BancoCliente banco;

    @GetMapping
    public List<Cliente>listar(){
        return banco.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cliente cliente){
        banco.save(cliente);
    }

    @PutMapping
    public void alterar(@RequestBody Cliente cliente){
        if(cliente.getId() > 0)
            banco.save(cliente);
    } 

    @DeleteMapping
    public void excluir(@RequestBody Cliente cliente){
        banco.delete(cliente);
    }
}
