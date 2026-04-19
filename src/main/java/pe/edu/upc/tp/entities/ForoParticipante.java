package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "foro_participante")
public class ForoParticipante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foro_participante")
    private Long idForoParticipante;

    @Column(name = "fecha_union")
    private LocalDateTime fechaUnion;

    @ManyToOne
    @JoinColumn(name = "foro_id")
    private Foro foro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public ForoParticipante() {
    }

    public ForoParticipante(Long idForoParticipante, LocalDateTime fechaUnion, Foro foro, Usuario usuario) {
        this.idForoParticipante = idForoParticipante;
        this.fechaUnion = fechaUnion;
        this.foro = foro;
        this.usuario = usuario;
    }

    public Long getIdForoParticipante() {
        return idForoParticipante;
    }

    public LocalDateTime getFechaUnion() {
        return fechaUnion;
    }

    public Foro getForo() {
        return foro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdForoParticipante(Long idForoParticipante) {
        this.idForoParticipante = idForoParticipante;
    }

    public void setFechaUnion(LocalDateTime fechaUnion) {
        this.fechaUnion = fechaUnion;
    }

    public void setForo(Foro foro) {
        this.foro = foro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
