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

import com.loja.restapi.banco.BancoFuncionario;
import com.loja.restapi.entidade.Funcionario;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioREST {
    @Autowired
    private BancoFuncionario banco;

    @GetMapping
    public List<Funcionario>listar(){
        return banco.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Funcionario funcionario){
        banco.save(funcionario);
    }

    @PutMapping
    public void alterar(@RequestBody Funcionario funcionario){
        if(funcionario.getId() > 0)
            banco.save(funcionario);
    } 

    @DeleteMapping
    public void excluir(@RequestBody Funcionario funcionario){
        banco.delete(funcionario);
    }
}
