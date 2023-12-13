package dao;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import modelo.Notification;
import modelo.Seguridad;


@Repository
public class LoggerImpl implements LoggerDao {

	@Autowired
	SeguridadJPASpring daoSeguridad;
	
	@Autowired
	NotificationJPASpring daoNoti;
	
	
	//DATOS DE EMPRESA
	@Override
	public void registrarLogueoUsuario(Seguridad seguridad) {
		daoSeguridad.save(seguridad);

	}


	@Override
	public Seguridad recuperarLoggeo(String id) {
		// TODO Auto-generated method stub
		return daoSeguridad.findById(id).orElse(null);
	}


	@Override
	public void registarLogNotification(Notification noti) {
		daoNoti.save(noti);
		
	}

	

}
