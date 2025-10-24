package ni.edu.uam.uam_app.modelo;
import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class Estudiante {
    @Id
    private String cif;
    @Column(name = "Nombres" , length = 30,nullable = false )
    @Required(message ="Nombre no puede quedar vacio...")
    private String nombres;
    @Column(name = "Apellidos", length = 30, nullable = false)
    @Required(message = "Apellido no puede quedar vacio...")
    private String apellido;
    LocalDate fechaNac;
}