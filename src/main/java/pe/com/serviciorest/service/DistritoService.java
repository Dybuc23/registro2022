/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Distrito;

/**
 *
 * @author User
 */
public interface DistritoService {

    List<Distrito> findAll();

    Optional<Distrito> findById(Long id);

    List<Distrito> findByName(String name);

    Distrito add(Distrito d);

    Distrito update(Distrito d);

    Distrito delete(Distrito d);
}
