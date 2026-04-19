package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Long idPerfil;

    @Column(name = "foto_url", length = 500)
    private String fotoUrl;

    @Column(name = "titulo_profesional", length = 200)
    private String tituloProfesional;

    @Column(name = "biografia", columnDefinition = "TEXT")
    private String biografia;

    @Column(name = "institucion", length = 200)
    private String institucion;

    @Column(name = "ubicacion", length = 200)
    private String ubicacion;

    @Column(name = "habilidades", columnDefinition = "TEXT")
    private String habilidades;

    @Column(name = "intereses", columnDefinition = "TEXT")
    private String intereses;

    @Column(name = "disponibilidad", length = 100)
    private String disponibilidad;

    @Column(name = "visibilidad", length = 50)
    private String visibilidad;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "perfil")
    private List<EnlacePerfil> enlacePerfilList;

    public Perfil() {
    }

    public Perfil(Long idPerfil, String fotoUrl, String tituloProfesional, String biografia, String institucion, String ubicacion, String habilidades, String intereses, String disponibilidad, String visibilidad, LocalDateTime fechaActualizacion, Usuario usuario, List<EnlacePerfil> enlacePerfilList) {
        this.idPerfil = idPerfil;
        this.fotoUrl = fotoUrl;
        this.tituloProfesional = tituloProfesional;
        this.biografia = biografia;
        this.institucion = institucion;
        this.ubicacion = ubicacion;
        this.habilidades = habilidades;
        this.intereses = intereses;
        this.disponibilidad = disponibilidad;
        this.visibilidad = visibilidad;
        this.fechaActualizacion = fechaActualizacion;
        this.usuario = usuario;
        this.enlacePerfilList = enlacePerfilList;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getIntereses() {
        return intereses;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<EnlacePerfil> getEnlacePerfilList() {
        return enlacePerfilList;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEnlacePerfilList(List<EnlacePerfil> enlacePerfilList) {
        this.enlacePerfilList = enlacePerfilList;
    }
}
