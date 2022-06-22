package com.loja.restapi.banco;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.restapi.entidade.Carro;

public interface BancoCarro extends JpaRepository<Carro,Long> {
   
}
