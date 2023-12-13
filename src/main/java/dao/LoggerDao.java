package dao;



import org.springframework.stereotype.Component;

import modelo.Notification;
import modelo.Seguridad;


@Component
public interface LoggerDao {
	
	
	//Seguridad de login
	void registrarLogueoUsuario(Seguridad seguridad);
	
	Seguridad recuperarLoggeo(String id);
	
	void registarLogNotification(Notification noti);
	

}
