package service;




import modelo.Notification;
import modelo.Seguridad;



public interface LoggerService {

		/* LOGIN Y SEGURIDAD*/
	String guardarLogueUsuario(Seguridad seguridad);
	
	String actualizarLogin(Seguridad seguridad);
	
	/*LOGIN NOTIFICATION CONFIRMAR PAGO*/
	
	String guardarEjecucionEstadoPago(String noti);
	
	
}
