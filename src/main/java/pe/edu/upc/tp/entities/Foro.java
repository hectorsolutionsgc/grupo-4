package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "foro")
public class Foro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foro")
    private Long idForo;

    @Column(name = "titulo", length = 200)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "foro")
    private List<ForoParticipante> foroParticipanteList;

    @OneToMany(mappedBy = "foro")
    private List<TemaForo> temaForoList;

    public Foro() {
    }

    public Foro(Long idForo, String titulo, String descripcion, String estado, LocalDateTime fechaCreacion, Usuario usuario, List<ForoParticipante> foroParticipanteList, List<TemaForo> temaForoList) {
        this.idForo = idForo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        this.foroParticipanteList = foroParticipanteList;
        this.temaForoList = temaForoList;
    }

    public Long getIdForo() {
        return idForo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ForoParticipante> getForoParticipanteList() {
        return foroParticipanteList;
    }

    public List<TemaForo> getTemaForoList() {
        return temaForoList;
    }

    public void setIdForo(Long idForo) {
        this.idForo = idForo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setForoParticipanteList(List<ForoParticipante> foroParticipanteList) {
        this.foroParticipanteList = foroParticipanteList;
    }

    public void setTemaForoList(List<TemaForo> temaForoList) {
        this.temaForoList = temaForoList;
    }
}
