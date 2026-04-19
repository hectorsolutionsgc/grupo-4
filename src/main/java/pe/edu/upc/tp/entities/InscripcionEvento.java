package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inscripcion_evento")
public class InscripcionEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private Long idInscripcion;

    @Column(name = "estado_asistencia", length = 50)
    private String estadoAsistencia;

    @Column(name = "fecha_inscripcion")
    private LocalDateTime fechaInscripcion;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public InscripcionEvento() {
    }

    public InscripcionEvento(Long idInscripcion, String estadoAsistencia, LocalDateTime fechaInscripcion, Evento evento, Usuario usuario) {
        this.idInscripcion = idInscripcion;
        this.estadoAsistencia = estadoAsistencia;
        this.fechaInscripcion = fechaInscripcion;
        this.evento = evento;
        this.usuario = usuario;
    }

    public Long getIdInscripcion() {
        return idInscripcion;
    }

    public String getEstadoAsistencia() {
        return estadoAsistencia;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public Evento getEvento() {
        return evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdInscripcion(Long idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setEstadoAsistencia(String estadoAsistencia) {
        this.estadoAsistencia = estadoAsistencia;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
