/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciorest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.serviciorest.entity.Categoria;

/**
 *
 * @author User
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    //mostrando todos los datos
    @Query("select c from Categoria c where c.estado='1'")
    List<Categoria> findAllCustom();

    @Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) "
            + "and c.estado='1'")
    List<Categoria> findByName(@Param("nombre") String nombre);
}
