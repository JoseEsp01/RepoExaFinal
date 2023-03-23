package com.ista.jose_exaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.jose_exaf.entity.Cliente;
import com.ista.jose_exaf.service.IClienteService;




@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
	@Autowired
    IClienteService clienteServ;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarCliente() {
        return new ResponseEntity<>(clienteServ.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente d) {
        return new ResponseEntity<>(clienteServ.save(d), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente d) {
        Cliente cliEncontrado = clienteServ.findById(id);
        if (cliEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	cliEncontrado.setNombre(d.getNombre());
            	cliEncontrado.setApellido(d.getApellido());
            	cliEncontrado.setCedula(d.getCedula());
            	cliEncontrado.setCorreo(d.getCorreo());
                return new ResponseEntity<>(clienteServ.save(d), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarCliente(@PathVariable Long id) {
    	clienteServ.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
