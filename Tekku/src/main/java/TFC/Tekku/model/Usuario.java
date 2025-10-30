package TFC.tekku.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    private NivelFisico nivelFisico;

    public enum NivelFisico {
        BAJO, MEDIO, ALTO
    }

    public Usuario convertirDesdeDTO(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        usuario.setRol(Usuario.Rol.valueOf(dto.getRol()));
        return usuario;
    }

    public UsuarioDTO convertirADTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNombre(usuario.getNombre());
        dto.setCorreo(usuario.getCorreo());
        dto.setRol(usuario.getRol().name());
        return dto;
    }

    @ManyToOne
    @JoinColumn(name = "campo_id")
    private CampoTrabajo campo;

    @ManyToMany(mappedBy = "completadoPor")
    private Set<ObjetivoGamificado> objetivosCompletados;

    @OneToMany(mappedBy = "usuario")

