package pe.edu.upc.tp.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "conexion")

public class Conexion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conexion")
    private Long idConexion;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_solicitud")
    private LocalDateTime fechaSolicitud;

    @Column(name = "fecha_respuesta")
    private LocalDateTime fechaRespuesta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Conexion() {
    }

    public Conexion(Long idConexion, String estado, LocalDateTime fechaSolicitud, LocalDateTime fechaRespuesta, Usuario usuario) {
        this.idConexion = idConexion;
        this.estado = estado;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRespuesta = fechaRespuesta;
        this.usuario = usuario;
    }

    public Long getIdConexion() {
        return idConexion;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdConexion(Long idConexion) {
        this.idConexion = idConexion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
