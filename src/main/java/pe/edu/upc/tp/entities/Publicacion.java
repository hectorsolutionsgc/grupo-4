package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacion")
    private Long idPublicacion;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

    // "Post", "Recurso Profesional"
    @Column(name = "tipo", length = 50)
    private String tipo;

    // "Privado", "Público"
    @Column(name = "visibilidad", length = 50)
    private String visibilidad;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToOne(mappedBy = "publicacion", cascade = CascadeType.ALL)
    private RecursoProfesional recursoProfesional;

    public Publicacion() {
    }

    public Publicacion(Long idPublicacion, String contenido, String tipo, String visibilidad, LocalDateTime fechaPublicacion, Usuario usuario, RecursoProfesional recursoProfesional) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.tipo = tipo;
        this.visibilidad = visibilidad;
        this.fechaPublicacion = fechaPublicacion;
        this.usuario = usuario;
        this.recursoProfesional = recursoProfesional;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public RecursoProfesional getRecursoProfesional() {
        return recursoProfesional;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setRecursoProfesional(RecursoProfesional recursoProfesional) {
        this.recursoProfesional = recursoProfesional;
    }
}
