package Reto3.reto3.repository.crud;

import Reto3.reto3.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Miguel Ramos
 */
public interface CategoriaCrudRepository extends JpaRepository<Categoria, Integer>{
    Categoria findByName (String name);
}

