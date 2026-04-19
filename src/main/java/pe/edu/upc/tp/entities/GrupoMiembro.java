package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "grupo_miembro")
public class GrupoMiembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo_miembro")
    private Long idGrupoMiembro;

    @Column(name = "rol_grupo", length = 50)
    private String rolGrupo;

    @Column(name = "fecha_union")
    private LocalDateTime fechaUnion;

    @ManyToOne
    @JoinColumn(name = "grupo_networking_id")
    private GrupoNetworking grupoNetworking;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public GrupoMiembro() {
    }

    public GrupoMiembro(Long idGrupoMiembro, String rolGrupo, LocalDateTime fechaUnion, GrupoNetworking grupoNetworking, Usuario usuario) {
        this.idGrupoMiembro = idGrupoMiembro;
        this.rolGrupo = rolGrupo;
        this.fechaUnion = fechaUnion;
        this.grupoNetworking = grupoNetworking;
        this.usuario = usuario;
    }

    public Long getIdGrupoMiembro() {
        return idGrupoMiembro;
    }

    public String getRolGrupo() {
        return rolGrupo;
    }

    public LocalDateTime getFechaUnion() {
        return fechaUnion;
    }

    public GrupoNetworking getGrupoNetworking() {
        return grupoNetworking;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdGrupoMiembro(Long idGrupoMiembro) {
        this.idGrupoMiembro = idGrupoMiembro;
    }

    public void setRolGrupo(String rolGrupo) {
        this.rolGrupo = rolGrupo;
    }

    public void setFechaUnion(LocalDateTime fechaUnion) {
        this.fechaUnion = fechaUnion;
    }

    public void setGrupoNetworking(GrupoNetworking grupoNetworking) {
        this.grupoNetworking = grupoNetworking;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
