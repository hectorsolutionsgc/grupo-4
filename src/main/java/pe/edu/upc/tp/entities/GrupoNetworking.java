package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "grupo_networking")
public class GrupoNetworking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo")
    private Long idGrupo;

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "privacidad", length = 50)
    private String privacidad;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "grupoNetworking")
    private List<GrupoMiembro> grupoMiembroList;

    public GrupoNetworking() {
    }

    public GrupoNetworking(Long idGrupo, String nombre, String descripcion, LocalDateTime fechaCreacion, String privacidad, Usuario usuario, List<GrupoMiembro> grupoMiembroList) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.privacidad = privacidad;
        this.usuario = usuario;
        this.grupoMiembroList = grupoMiembroList;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<GrupoMiembro> getGrupoMiembroList() {
        return grupoMiembroList;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setGrupoMiembroList(List<GrupoMiembro> grupoMiembroList) {
        this.grupoMiembroList = grupoMiembroList;
    }
}
