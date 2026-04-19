package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enlace_perfil")

public class EnlacePerfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enlace")
    private Long idEnlace;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "url", length = 500)
    private String url;

    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    public EnlacePerfil() {
    }

    public EnlacePerfil(Long idEnlace, String tipo, String url, Perfil perfil) {
        this.idEnlace = idEnlace;
        this.tipo = tipo;
        this.url = url;
        this.perfil = perfil;
    }

    public Long getIdEnlace() {
        return idEnlace;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUrl() {
        return url;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setIdEnlace(Long idEnlace) {
        this.idEnlace = idEnlace;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
