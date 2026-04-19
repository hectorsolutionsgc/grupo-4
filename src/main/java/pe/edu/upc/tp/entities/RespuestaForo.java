package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "respuesta_foro")
public class RespuestaForo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_foro")
    private Long idRespuestaForo;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

    @Column(name = "fecha_respuesta")
    private LocalDateTime fechaRespuesta;

    @ManyToOne
    @JoinColumn(name = "tema_foro_id")
    private TemaForo temaForo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public RespuestaForo() {
    }

    public RespuestaForo(Long idRespuestaForo, String contenido, LocalDateTime fechaRespuesta, TemaForo temaForo, Usuario usuario) {
        this.idRespuestaForo = idRespuestaForo;
        this.contenido = contenido;
        this.fechaRespuesta = fechaRespuesta;
        this.temaForo = temaForo;
        this.usuario = usuario;
    }

    public Long getIdRespuestaForo() {
        return idRespuestaForo;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public TemaForo getTemaForo() {
        return temaForo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdRespuestaForo(Long idRespuestaForo) {
        this.idRespuestaForo = idRespuestaForo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public void setTemaForo(TemaForo temaForo) {
        this.temaForo = temaForo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
