package pe.edu.upc.tp.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calificacion_mentoria")

public class CalificacionMentoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Long idCalificacion;

    @Column(name = "puntuacion")
    private Integer puntuacion;

    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "fecha_calificacion")
    private LocalDateTime fechaCalificacion;

    @OneToOne
    @JoinColumn(name = "mentoria_id")
    private Mentoria mentoria;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public CalificacionMentoria() {
    }

    public CalificacionMentoria(Long idCalificacion, Integer puntuacion, String comentario, LocalDateTime fechaCalificacion, Mentoria mentoria, Usuario usuario) {
        this.idCalificacion = idCalificacion;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fechaCalificacion = fechaCalificacion;
        this.mentoria = mentoria;
        this.usuario = usuario;
    }

    public Long getIdCalificacion() {
        return idCalificacion;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public LocalDateTime getFechaCalificacion() {
        return fechaCalificacion;
    }

    public Mentoria getMentoria() {
        return mentoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdCalificacion(Long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaCalificacion(LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }

    public void setMentoria(Mentoria mentoria) {
        this.mentoria = mentoria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
