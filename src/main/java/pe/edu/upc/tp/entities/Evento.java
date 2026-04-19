package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long idEvento;

    @Column(name = "titulo", length = 200)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "modalidad", length = 50)
    private String modalidad;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "enlace_acceso", length = 500)
    private String enlaceAcceso;

    @Column(name = "grabacion_url", length = 500)
    private String grabacionUrl;

    @Column(name = "cupos")
    private Integer cupos;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "evento")
    private List<InscripcionEvento> inscripcionEventoList;

    public Evento() {
    }

    public Evento(Long idEvento, String titulo, String descripcion, String tipo, String modalidad, LocalDateTime fechaInicio, LocalDateTime fechaFin, String enlaceAcceso, String grabacionUrl, Integer cupos, Usuario usuario, List<InscripcionEvento> inscripcionEventoList) {
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modalidad = modalidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.enlaceAcceso = enlaceAcceso;
        this.grabacionUrl = grabacionUrl;
        this.cupos = cupos;
        this.usuario = usuario;
        this.inscripcionEventoList = inscripcionEventoList;
    }

    public Long getIdEvento() {
        return idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public String getEnlaceAcceso() {
        return enlaceAcceso;
    }

    public String getGrabacionUrl() {
        return grabacionUrl;
    }

    public Integer getCupos() {
        return cupos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<InscripcionEvento> getInscripcionEventoList() {
        return inscripcionEventoList;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setEnlaceAcceso(String enlaceAcceso) {
        this.enlaceAcceso = enlaceAcceso;
    }

    public void setGrabacionUrl(String grabacionUrl) {
        this.grabacionUrl = grabacionUrl;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setInscripcionEventoList(List<InscripcionEvento> inscripcionEventoList) {
        this.inscripcionEventoList = inscripcionEventoList;
    }
}
