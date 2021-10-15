package Reto3.reto3.service;

import Reto3.reto3.model.Categoria;
import Reto3.reto3.repository.crud.CategoriaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Ramos
 */
@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaCrudRepository repository;
    
    public List<Categoria> getCategorias(){
        return repository.findAll();
    }
    
    public Categoria getCategoriaById(int id){
        return repository.findById(id).orElse(null);
    }
    
    public Categoria getCategoriaByName(String name){
        return repository.findByName(name);
    }
    
    public String deleteCategoria(int id){
        repository.deleteById(id);
        return "Producto removido"+id;
    }
    
    public Categoria updateCategoria (Categoria categoria){
        Categoria existe=getCategoriaById(categoria.getId());
        existe.setName(categoria.getName());
        existe.setDescription(categoria.getDescription());
        return repository.save(existe);
    }
    
    public Categoria saveCategoria(Categoria c){
        if(c.getId()==null){
            return repository.save(c);
        }else{
            Optional<Categoria> caux = repository.findById(c.getId());  // Categoria Auxiliar == caux
            if(caux.isEmpty()){
                return repository.save(c);
            }else{
                return c;
            }
        }
    }
    
}
