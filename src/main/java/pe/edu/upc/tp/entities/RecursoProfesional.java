package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "recurso_profesional")
public class RecursoProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recurso")
    private Long idRecurso;

    @Column(name = "titulo", length = 200)
    private String titulo;

    @Column(name = "categoria", length = 100)
    private String categoria;

    @Column(name = "archivo_url", length = 500)
    private String archivoUrl;

    @Column(name = "formato", length = 50)
    private String formato;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "publicacion_id")
    private Publicacion publicacion;

    public RecursoProfesional() {
    }

    public RecursoProfesional(Long idRecurso, String titulo, String categoria, String archivoUrl, String formato, String descripcion, Publicacion publicacion) {
        this.idRecurso = idRecurso;
        this.titulo = titulo;
        this.categoria = categoria;
        this.archivoUrl = archivoUrl;
        this.formato = formato;
        this.descripcion = descripcion;
        this.publicacion = publicacion;
    }

    public Long getIdRecurso() {
        return idRecurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getArchivoUrl() {
        return archivoUrl;
    }

    public String getFormato() {
        return formato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setArchivoUrl(String archivoUrl) {
        this.archivoUrl = archivoUrl;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
