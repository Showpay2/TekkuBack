package TFC.tekku.mapper;

import TFC.tekku.dto.*;
import TFC.tekku.model.*;

public class DtoMapper {

    public static Usuario fromUsuarioDTO(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        usuario.setRol(Usuario.Rol.valueOf(dto.getRol()));
        return usuario;
    }

    public static UsuarioDTO toUsuarioDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNombre(usuario.getNombre());
        dto.setCorreo(usuario.getCorreo());
        dto.setRol(usuario.getRol().name());
        return dto;
    }

    public static Tarea fromTareaDTO(TareaDTO dto, Usuario peon) {
        Tarea tarea = new Tarea();
        tarea.setNombre(dto.getNombre());
        tarea.setDescripcion(dto.getDescripcion());
        tarea.setDificultadFisica(Tarea.DificultadFisica.valueOf(dto.getDificultadFisica()));
        tarea.setEstado(Tarea.Estado.valueOf(dto.getEstado()));
        tarea.setAsignadoA(peon);
        return tarea;
    }

    public static Turno fromTurnoDTO(TurnoDTO dto, Usuario peon) {
        Turno turno = new Turno();
        turno.setFechaInicio(dto.getFechaInicio());
        turno.setFechaFin(dto.getFechaFin());
        turno.setTipo(Turno.TipoTurno.valueOf(dto.getTipoTurno()));
        turno.setUsuario(peon);
        return turno;
    }

    public static HorasExtra fromHorasExtraDTO(HorasExtraDTO dto, Usuario usuario) {
        HorasExtra horas = new HorasExtra();
        horas.setFecha(dto.getFecha());
        horas.setCantidadHoras(dto.getCantidadHoras());
        horas.setAprobado(dto.isAprobado());
        horas.setUsuario(usuario);
        return horas;
    }

    public static Maquina fromMaquinaDTO(MaquinaDTO dto) {
        Maquina maquina = new Maquina();
        maquina.setNombre(dto.getNombre());
        maquina.setDificultad(Maquina.DificultadFisica.valueOf(dto.getDificultadFisica()));
        return maquina;
    }

    public static CampoTrabajo fromCampoTrabajoDTO(CampoTrabajoDTO dto) {
        CampoTrabajo campo = new CampoTrabajo();
        campo.setNombre(dto.getNombre());
        return campo;
    }

    public static ObjetivoGamificado fromObjetivoGamificadoDTO(ObjetivoGamificadoDTO dto) {
        ObjetivoGamificado objetivo = new ObjetivoGamificado();
        objetivo.setDescripcion(dto.getDescripcion());
        objetivo.setPuntos(dto.getPuntos());
        return objetivo;
    }

    public static AsignacionMaquina fromAsignacionMaquinaDTO(AsignacionMaquinaDTO dto, Usuario peon, Maquina maquina) {
        AsignacionMaquina asignacion = new AsignacionMaquina();
        asignacion.setPeon(peon);
        asignacion.setMaquina(maquina);
        return asignacion;
    }
}