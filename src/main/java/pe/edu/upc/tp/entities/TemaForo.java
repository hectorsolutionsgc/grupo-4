package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tema_foro")
public class TemaForo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tema")
    private Long idTema;

    @Column(name = "titulo", length = 200)
    private String titulo;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "foro_id")
    private Foro foro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "temaForo")
    private List<RespuestaForo> respuestaForoList;

    public TemaForo() {
    }

    public TemaForo(Long idTema, String titulo, String contenido, LocalDateTime fechaCreacion, Foro foro, Usuario usuario, List<RespuestaForo> respuestaForoList) {
        this.idTema = idTema;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.foro = foro;
        this.usuario = usuario;
        this.respuestaForoList = respuestaForoList;
    }

    public Long getIdTema() {
        return idTema;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public Foro getForo() {
        return foro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<RespuestaForo> getRespuestaForoList() {
        return respuestaForoList;
    }

    public void setIdTema(Long idTema) {
        this.idTema = idTema;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setForo(Foro foro) {
        this.foro = foro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setRespuestaForoList(List<RespuestaForo> respuestaForoList) {
        this.respuestaForoList = respuestaForoList;
    }
}
