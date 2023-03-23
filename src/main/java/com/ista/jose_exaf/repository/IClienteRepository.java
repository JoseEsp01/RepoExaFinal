package com.ista.jose_exaf.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.jose_exaf.entity.Cliente;


public interface IClienteRepository extends MongoRepository<Cliente,Long>{

}
