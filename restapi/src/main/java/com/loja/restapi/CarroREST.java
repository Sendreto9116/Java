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

import com.loja.restapi.banco.BancoCarro;
import com.loja.restapi.entidade.Carro;

@RestController
@RequestMapping("/carro")
public class CarroREST {
    @Autowired
    private BancoCarro banco;

    @GetMapping
    public List<Carro> listar() {
        return banco.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Carro carro) {
        banco.save(carro);
    }

    @PutMapping
    public void alterar(@RequestBody Carro carro) {
        if (carro.getId() > 0)
            banco.save(carro);
    }

    @DeleteMapping
    public void excluir(@RequestBody Carro carro) {
        banco.delete(carro);
    }
}
