public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    List<Notificacion> findByReceptorIdAndLeidaFalse(Long receptorId);
}