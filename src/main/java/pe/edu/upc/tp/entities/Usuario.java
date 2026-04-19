package pe.edu.upc.tp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombres", length = 100)
    private String nombres;

    @Column(name = "apellido_paterno", length = 100)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 100)
    private String apellidoMaterno;

    @Column(name = "correo", length = 150)
    private String correo;

    @Column(name = "contrasena_hash", length = 255)
    private String conttasenaHash;

    @Column(name = "estado_cuenta", length = 50)
    private String estadoCuenta;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "ultima_sesion")
    private LocalDateTime ultimaSesion;

    @OneToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfil perfil;

    @OneToMany(mappedBy = "usuario")
    private List<Evento> eventoList;

    @OneToMany(mappedBy = "usuario")
    private List<InscripcionEvento> inscripcionEventoList;

    @OneToMany(mappedBy = "usuario")
    private List<Conexion> conexionList;

    @OneToMany(mappedBy = "usuario")
    private List<Mensaje> mensajeList;

    @OneToMany(mappedBy = "usuario")
    private List<ChatParticipante> chatParticipanteList;

    @OneToMany(mappedBy = "usuario")
    private List<RespuestaForo> respuestaForoList;

    @OneToMany(mappedBy = "usuario")
    private List<TemaForo> temaForoList;

    @OneToMany(mappedBy = "usuario")
    private List<Foro> foroList;

    @OneToMany(mappedBy = "usuario")
    private List<ForoParticipante> foroParticipanteList;

    @OneToMany(mappedBy = "usuario")
    private List<Publicacion> publicacionList;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioSeguidor> usuarioSeguidorList;

    @OneToMany(mappedBy = "usuario")
    private List<GrupoNetworking> grupoNetworkingList;

    @OneToMany(mappedBy = "usuario")
    private List<GrupoMiembro> grupoMiembroList;

    @OneToMany(mappedBy = "usuario")
    private List<Mentoria> mentoriaList;

    @OneToMany(mappedBy = "usuario")
    private List<CalificacionMentoria> calificacionMentoriaList;

    @OneToMany(mappedBy = "usuario")
    private List<SolicitudRecomendacion> solicitudRecomendacionList;

    @OneToMany(mappedBy = "usuario")
    private List<SolicitudChat> solicitudChatList;

    @OneToMany(mappedBy = "usuario")
    private List<RecomendacionMentor> recomendacionMentorList;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombres, String apellidoPaterno, String apellidoMaterno, String correo, String conttasenaHash, String estadoCuenta, LocalDateTime fechaRegistro, LocalDateTime ultimaSesion, Rol rol, Perfil perfil, List<Evento> eventoList, List<InscripcionEvento> inscripcionEventoList, List<Conexion> conexionList, List<Mensaje> mensajeList, List<ChatParticipante> chatParticipanteList, List<RespuestaForo> respuestaForoList, List<TemaForo> temaForoList, List<Foro> foroList, List<ForoParticipante> foroParticipanteList, List<Publicacion> publicacionList, List<UsuarioSeguidor> usuarioSeguidorList, List<GrupoNetworking> grupoNetworkingList, List<GrupoMiembro> grupoMiembroList, List<Mentoria> mentoriaList, List<CalificacionMentoria> calificacionMentoriaList, List<SolicitudRecomendacion> solicitudRecomendacionList, List<SolicitudChat> solicitudChatList, List<RecomendacionMentor> recomendacionMentorList) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.conttasenaHash = conttasenaHash;
        this.estadoCuenta = estadoCuenta;
        this.fechaRegistro = fechaRegistro;
        this.ultimaSesion = ultimaSesion;
        this.rol = rol;
        this.perfil = perfil;
        this.eventoList = eventoList;
        this.inscripcionEventoList = inscripcionEventoList;
        this.conexionList = conexionList;
        this.mensajeList = mensajeList;
        this.chatParticipanteList = chatParticipanteList;
        this.respuestaForoList = respuestaForoList;
        this.temaForoList = temaForoList;
        this.foroList = foroList;
        this.foroParticipanteList = foroParticipanteList;
        this.publicacionList = publicacionList;
        this.usuarioSeguidorList = usuarioSeguidorList;
        this.grupoNetworkingList = grupoNetworkingList;
        this.grupoMiembroList = grupoMiembroList;
        this.mentoriaList = mentoriaList;
        this.calificacionMentoriaList = calificacionMentoriaList;
        this.solicitudRecomendacionList = solicitudRecomendacionList;
        this.solicitudChatList = solicitudChatList;
        this.recomendacionMentorList = recomendacionMentorList;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public String getConttasenaHash() {
        return conttasenaHash;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDateTime getUltimaSesion() {
        return ultimaSesion;
    }

    public Rol getRol() {
        return rol;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public List<Evento> getEventoList() {
        return eventoList;
    }

    public List<InscripcionEvento> getInscripcionEventoList() {
        return inscripcionEventoList;
    }

    public List<Conexion> getConexionList() {
        return conexionList;
    }

    public List<Mensaje> getMensajeList() {
        return mensajeList;
    }

    public List<ChatParticipante> getChatParticipanteList() {
        return chatParticipanteList;
    }

    public List<RespuestaForo> getRespuestaForoList() {
        return respuestaForoList;
    }

    public List<TemaForo> getTemaForoList() {
        return temaForoList;
    }

    public List<Foro> getForoList() {
        return foroList;
    }

    public List<ForoParticipante> getForoParticipanteList() {
        return foroParticipanteList;
    }

    public List<Publicacion> getPublicacionList() {
        return publicacionList;
    }

    public List<UsuarioSeguidor> getUsuarioSeguidorList() {
        return usuarioSeguidorList;
    }

    public List<GrupoNetworking> getGrupoNetworkingList() {
        return grupoNetworkingList;
    }

    public List<GrupoMiembro> getGrupoMiembroList() {
        return grupoMiembroList;
    }

    public List<Mentoria> getMentoriaList() {
        return mentoriaList;
    }

    public List<CalificacionMentoria> getCalificacionMentoriaList() {
        return calificacionMentoriaList;
    }

    public List<SolicitudRecomendacion> getSolicitudRecomendacionList() {
        return solicitudRecomendacionList;
    }

    public List<SolicitudChat> getSolicitudChatList() {
        return solicitudChatList;
    }

    public List<RecomendacionMentor> getRecomendacionMentorList() {
        return recomendacionMentorList;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setConttasenaHash(String conttasenaHash) {
        this.conttasenaHash = conttasenaHash;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setUltimaSesion(LocalDateTime ultimaSesion) {
        this.ultimaSesion = ultimaSesion;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    public void setInscripcionEventoList(List<InscripcionEvento> inscripcionEventoList) {
        this.inscripcionEventoList = inscripcionEventoList;
    }

    public void setConexionList(List<Conexion> conexionList) {
        this.conexionList = conexionList;
    }

    public void setMensajeList(List<Mensaje> mensajeList) {
        this.mensajeList = mensajeList;
    }

    public void setChatParticipanteList(List<ChatParticipante> chatParticipanteList) {
        this.chatParticipanteList = chatParticipanteList;
    }

    public void setRespuestaForoList(List<RespuestaForo> respuestaForoList) {
        this.respuestaForoList = respuestaForoList;
    }

    public void setTemaForoList(List<TemaForo> temaForoList) {
        this.temaForoList = temaForoList;
    }

    public void setForoList(List<Foro> foroList) {
        this.foroList = foroList;
    }

    public void setForoParticipanteList(List<ForoParticipante> foroParticipanteList) {
        this.foroParticipanteList = foroParticipanteList;
    }

    public void setPublicacionList(List<Publicacion> publicacionList) {
        this.publicacionList = publicacionList;
    }

    public void setUsuarioSeguidorList(List<UsuarioSeguidor> usuarioSeguidorList) {
        this.usuarioSeguidorList = usuarioSeguidorList;
    }

    public void setGrupoNetworkingList(List<GrupoNetworking> grupoNetworkingList) {
        this.grupoNetworkingList = grupoNetworkingList;
    }

    public void setGrupoMiembroList(List<GrupoMiembro> grupoMiembroList) {
        this.grupoMiembroList = grupoMiembroList;
    }

    public void setMentoriaList(List<Mentoria> mentoriaList) {
        this.mentoriaList = mentoriaList;
    }

    public void setCalificacionMentoriaList(List<CalificacionMentoria> calificacionMentoriaList) {
        this.calificacionMentoriaList = calificacionMentoriaList;
    }

    public void setSolicitudRecomendacionList(List<SolicitudRecomendacion> solicitudRecomendacionList) {
        this.solicitudRecomendacionList = solicitudRecomendacionList;
    }

    public void setSolicitudChatList(List<SolicitudChat> solicitudChatList) {
        this.solicitudChatList = solicitudChatList;
    }

    public void setRecomendacionMentorList(List<RecomendacionMentor> recomendacionMentorList) {
        this.recomendacionMentorList = recomendacionMentorList;
    }
}
