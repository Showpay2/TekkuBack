public interface NotificacionService {
    Notificacion enviar(NotificacionDTO dto);
    List<Notificacion> obtenerPorUsuario(Long usuarioId);
}