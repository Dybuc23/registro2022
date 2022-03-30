/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciorest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.serviciorest.entity.Distrito;

/**
 *
 * @author User
 */
public interface DistritoRepository extends JpaRepository<Distrito, Long>{
    
    @Query("select d from Distrito d where d.estado='1'")
    List<Distrito> findAllCustom();
//
    @Query("select d from Distrito d where upper(d.nombre) like upper(:nombre) "
            + "and d.estado='1'")
    List<Distrito> findByName(@Param("nombre") String nombre);
}
