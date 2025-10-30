@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepo;

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Notificacion enviar(NotificacionDTO dto) {
        Usuario emisor = usuarioRepo.findById(dto.getEmisorId()).orElseThrow();
        Usuario receptor = usuarioRepo.findById(dto.getReceptorId()).orElseThrow();

        if (emisor.getRol() != Usuario.Rol.JEFE_EQUIPO || receptor.getRol() != Usuario.Rol.PEON) {
            throw new RuntimeException("Solo los jefes de equipo pueden enviar notificaciones a peones.");
        }

        Notificacion noti = new Notificacion();
        noti.setMensaje(dto.getMensaje());
        noti.setFecha(LocalDateTime.now());
        noti.setEmisor(emisor);
        noti.setReceptor(receptor);
        return notificacionRepo.save(noti);
    }

    @Override
    public List<Notificacion> obtenerPorUsuario(Long usuarioId) {
        return notificacionRepo.findByReceptorIdAndLeidaFalse(usuarioId);
    }
}