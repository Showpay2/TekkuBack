@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @PostMapping
    public Notificacion enviar(@Valid @RequestBody NotificacionDTO dto) {
        return notificacionService.enviar(dto);
    }

    @GetMapping("/usuario/{id}")
    public List<Notificacion> obtener(@PathVariable Long id) {
        return notificacionService.obtenerPorUsuario(id);
    }
}