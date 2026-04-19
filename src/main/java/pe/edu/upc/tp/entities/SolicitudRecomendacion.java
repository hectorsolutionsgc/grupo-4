package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "solicitud_recomendacion")
public class SolicitudRecomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Long idSolicitud;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "mensaje", columnDefinition = "TEXT")
    private String mensaje;

    @Column(name = "estado", length = 50)
    private String estado;

    @Column(name = "fecha_solicitud")
    private LocalDateTime fechaSolicitud;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public SolicitudRecomendacion() {
    }

    public SolicitudRecomendacion(Long idSolicitud, String tipo, String mensaje, String estado, LocalDateTime fechaSolicitud, Usuario usuario) {
        this.idSolicitud = idSolicitud;
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.estado = estado;
        this.fechaSolicitud = fechaSolicitud;
        this.usuario = usuario;
    }

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
