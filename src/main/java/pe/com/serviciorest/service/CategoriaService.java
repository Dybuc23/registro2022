/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Categoria;

/**
 *
 * @author User
 */
public interface CategoriaService {

    List<Categoria> findAll();

    Optional<Categoria> findById(Long id);

    List<Categoria> findByName(String name);

    Categoria add(Categoria c);

    Categoria update(Categoria c);

    Categoria delete(Categoria c);

}
