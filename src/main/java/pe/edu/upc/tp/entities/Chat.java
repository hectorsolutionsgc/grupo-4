package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat")
    private Long idChat;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @OneToMany(mappedBy = "chat")
    private List<Mensaje> mensajeList;

    @OneToMany(mappedBy = "chat")
    private List<ChatParticipante> chatParticipanteList;

    public Chat() {
    }

    public Chat(Long idChat, String tipo, String estado, LocalDateTime fechaCreacion, List<Mensaje> mensajeList, List<ChatParticipante> chatParticipanteList) {
        this.idChat = idChat;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.mensajeList = mensajeList;
        this.chatParticipanteList = chatParticipanteList;
    }

    public Long getIdChat() {
        return idChat;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public List<Mensaje> getMensajeList() {
        return mensajeList;
    }

    public List<ChatParticipante> getChatParticipanteList() {
        return chatParticipanteList;
    }

    public void setIdChat(Long idChat) {
        this.idChat = idChat;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setMensajeList(List<Mensaje> mensajeList) {
        this.mensajeList = mensajeList;
    }

    public void setChatParticipanteList(List<ChatParticipante> chatParticipanteList) {
        this.chatParticipanteList = chatParticipanteList;
    }
}
