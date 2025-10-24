package ni.edu.uam.uam_app.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Carrera {
    @Id
    private double id;
    private String nombre;
    private String descripcion;
}
