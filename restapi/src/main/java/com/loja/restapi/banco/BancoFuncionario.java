package com.loja.restapi.banco;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.restapi.entidade.Funcionario;

public interface BancoFuncionario extends JpaRepository<Funcionario,Long>{
    
}
