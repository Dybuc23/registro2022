/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Cliente;

/**
 *
 * @author User
 */
public interface ClienteService {
    
    List<Cliente> findAll();

    Optional<Cliente> findById(Long id);

    List<Cliente> findByName(String name);

    Cliente add(Cliente c);

    Cliente update(Cliente c);

    Cliente delete(Cliente c);
}
