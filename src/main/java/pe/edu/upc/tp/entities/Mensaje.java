package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensaje")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensaje")
    private Long idMensaje;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

    @Column(name = "fecha_envio")
    private LocalDateTime fechaEnvio;

    @Column(name = "leido")
    private Boolean leido;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    public Mensaje() {
    }

    public Mensaje(Long idMensaje, String contenido, LocalDateTime fechaEnvio, Boolean leido, Usuario usuario, Chat chat) {
        this.idMensaje = idMensaje;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.leido = leido;
        this.usuario = usuario;
        this.chat = chat;
    }

    public Long getIdMensaje() {
        return idMensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public Boolean getLeido() {
        return leido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Chat getChat() {
        return chat;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
