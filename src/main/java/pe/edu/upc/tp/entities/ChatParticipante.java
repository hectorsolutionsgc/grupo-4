package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "chat_participante")

public class ChatParticipante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat_participante")
    private Long idChatParticipante;

    @Column(name = "fecha_union")
    private LocalDateTime fechaUnion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    public ChatParticipante() {
    }

    public ChatParticipante(Long idChatParticipante, LocalDateTime fechaUnion, Usuario usuario, Chat chat) {
        this.idChatParticipante = idChatParticipante;
        this.fechaUnion = fechaUnion;
        this.usuario = usuario;
        this.chat = chat;
    }

    public Long getIdChatParticipante() {
        return idChatParticipante;
    }

    public LocalDateTime getFechaUnion() {
        return fechaUnion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Chat getChat() {
        return chat;
    }

    public void setIdChatParticipante(Long idChatParticipante) {
        this.idChatParticipante = idChatParticipante;
    }

    public void setFechaUnion(LocalDateTime fechaUnion) {
        this.fechaUnion = fechaUnion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
