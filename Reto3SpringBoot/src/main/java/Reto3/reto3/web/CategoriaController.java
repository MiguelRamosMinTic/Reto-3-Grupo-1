package Reto3.reto3.web;

import Reto3.reto3.model.Categoria;
import Reto3.reto3.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

/**
 *
 * @author Miguel Ramos
 */
@RestController
@RequestMapping("/api/Category")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping("/all")
    public List<Categoria> findAllCategorias() {
        return service.getCategorias();
    }

    @GetMapping("/{id}")
    public Categoria findCategoriasId(@PathVariable int id) {
        return service.getCategoriaById(id);
    }

    @PostMapping("/save")
    public ResponseEntity addCategoria(@RequestBody Categoria categoria) {
        service.saveCategoria(categoria);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/update")
    public ResponseEntity updateCategoria(@RequestBody Categoria categoria){
    service.updateCategoria(categoria);
    return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteCategoria(@RequestBody Categoria categoria) {
        service.deleteCategoria(categoria.getId());
        return ResponseEntity.status(204).build();
    }

}
