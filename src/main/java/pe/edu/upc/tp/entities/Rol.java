package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;

    // "Estudiante", "Mentor"
    @Column(name = "nombre_rol", length = 50)
    private String nombreRol;

    @OneToOne(mappedBy = "rol")
    private Usuario usuario;

    public Rol() {
    }

    public Rol(Long idRol, String nombreRol, Usuario usuario) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.usuario = usuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
