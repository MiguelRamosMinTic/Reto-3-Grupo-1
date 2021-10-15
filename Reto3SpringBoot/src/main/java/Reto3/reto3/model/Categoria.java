package Reto3.reto3.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author Miguel Ramos
 */
//@Data --------------------- Genera por defecto set and getter
//@AllArgsConstructor ------- El constructor con argumentos 
//@NoArgsConstructor -------- El constructor sin argumentos 

@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}

