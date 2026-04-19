package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "mentoria")
public class Mentoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mentoria")
    private Long idMentoria;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToOne(mappedBy = "mentoria", cascade = CascadeType.ALL)
    private CalificacionMentoria calificacionMentoria;

    public Mentoria() {
    }

    public Mentoria(Long idMentoria, String estado, LocalDateTime fechaInicio, LocalDateTime fechaFin, Usuario usuario, CalificacionMentoria calificacionMentoria) {
        this.idMentoria = idMentoria;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.calificacionMentoria = calificacionMentoria;
    }

    public Long getIdMentoria() {
        return idMentoria;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public CalificacionMentoria getCalificacionMentoria() {
        return calificacionMentoria;
    }

    public void setIdMentoria(Long idMentoria) {
        this.idMentoria = idMentoria;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCalificacionMentoria(CalificacionMentoria calificacionMentoria) {
        this.calificacionMentoria = calificacionMentoria;
    }
}
