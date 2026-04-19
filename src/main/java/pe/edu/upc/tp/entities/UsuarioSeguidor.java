package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuario_seguidor")
public class UsuarioSeguidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_seguidor")
    private Long idUsuarioSeguidor;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "estado", length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public UsuarioSeguidor() {
    }

    public UsuarioSeguidor(Long idUsuarioSeguidor, LocalDateTime fechaInicio, String estado, Usuario usuario) {
        this.idUsuarioSeguidor = idUsuarioSeguidor;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Long getIdUsuarioSeguidor() {
        return idUsuarioSeguidor;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdUsuarioSeguidor(Long idUsuarioSeguidor) {
        this.idUsuarioSeguidor = idUsuarioSeguidor;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
