package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "recomendacion_mentor")
public class RecomendacionMentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recomendacion")
    private Long idRecomendacion;

    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "utilidad", length = 100)
    private String utilidad;

    @Column(name = "fecha_recomendacion")
    private LocalDateTime fechaRecomendacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public RecomendacionMentor() {
    }

    public RecomendacionMentor(Long idRecomendacion, String comentario, String utilidad, LocalDateTime fechaRecomendacion, Usuario usuario) {
        this.idRecomendacion = idRecomendacion;
        this.comentario = comentario;
        this.utilidad = utilidad;
        this.fechaRecomendacion = fechaRecomendacion;
        this.usuario = usuario;
    }

    public Long getIdRecomendacion() {
        return idRecomendacion;
    }

    public String getComentario() {
        return comentario;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public LocalDateTime getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdRecomendacion(Long idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public void setFechaRecomendacion(LocalDateTime fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
