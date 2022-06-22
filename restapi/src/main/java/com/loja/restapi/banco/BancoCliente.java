package com.loja.restapi.banco;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.restapi.entidade.Cliente;

public interface BancoCliente extends JpaRepository<Cliente,Long>{
       

}
