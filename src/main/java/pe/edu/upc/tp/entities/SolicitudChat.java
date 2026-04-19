package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "solicitud_chat")
public class SolicitudChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_chat")
    private Long idSolicitudChat;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_envio")
    private LocalDateTime fechaEnvio;

    @Column(name = "fecha_respuesta")
    private LocalDateTime fechaRespuesta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public SolicitudChat() {
    }

    public SolicitudChat(Long idSolicitudChat, String estado, LocalDateTime fechaEnvio, LocalDateTime fechaRespuesta, Usuario usuario) {
        this.idSolicitudChat = idSolicitudChat;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.fechaRespuesta = fechaRespuesta;
        this.usuario = usuario;
    }

    public Long getIdSolicitudChat() {
        return idSolicitudChat;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdSolicitudChat(Long idSolicitudChat) {
        this.idSolicitudChat = idSolicitudChat;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
