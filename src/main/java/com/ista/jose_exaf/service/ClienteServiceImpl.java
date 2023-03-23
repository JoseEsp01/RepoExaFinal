package com.ista.jose_exaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.jose_exaf.entity.Cliente;
import com.ista.jose_exaf.repository.IClienteRepository;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long>implements IClienteService{

    @Autowired
    IClienteRepository ClienteRepository;
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return ClienteRepository;
    }
}

